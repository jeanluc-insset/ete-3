/* This class is based upon on a copyrighted work from ANTLR Project which
 * is governed by rhe BSD 3-clause.
 *
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 *
 * Copyright (©) 2018 by Jean-Luc Déléage.
 */

package fr.insset.jeanluc.constraint_language.antlr4;

import fr.insset.jeanluc.ete.defs.EteException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.Tool;
import org.antlr.v4.codegen.CodeGenerator;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.tool.Grammar;
import org.antlr.v4.tool.ast.GrammarRootAST;
import org.codehaus.plexus.compiler.util.scan.InclusionScanException;
import org.codehaus.plexus.compiler.util.scan.SimpleSourceInclusionScanner;
import org.codehaus.plexus.compiler.util.scan.SourceInclusionScanner;
import org.codehaus.plexus.compiler.util.scan.mapping.SourceMapping;
import org.codehaus.plexus.compiler.util.scan.mapping.SuffixMapping;

/**
 * Parses a parser grammar and generates the java classes (actually, runs antlr
 * on the parser grammar). Then compiles the generated Java classes.<br>
 * 
 * The original Mojo class has been turned into a Pojo class.
 * Some properties have been modified from File to String.
 *
 * @author jldeleage
 */
public class AntlrRunnerOld {

    private String sourceDirectoryPath;
    private String outputDirectoryPath;
    private String libDirectoryPath;
    private Set<String> excludes = new HashSet<String>();
    private Set<String> includes = new HashSet<String>();
    private String statusDirectory = "maven-status/antlr4";

    public void execute(String sourceDirectoryPath, String outputDirectoryPath, String libDirectoryPath) {
        this.libDirectoryPath = libDirectoryPath;
        build(sourceDirectoryPath, outputDirectoryPath, libDirectoryPath);
        compile(outputDirectoryPath);
    }


    public void build(String sourceDirectoryPath, String outputDirectoryPath, String libDirectoryPath) {
        Logger log = Logger.getGlobal();

        Tool tool;

        File sourceDirectory = new File(sourceDirectoryPath);

//		outputEncoding = validateEncoding(outputEncoding);
        if (!sourceDirectory.isDirectory()) {
            return;
        }

        // Ensure that the output directory path is all in tact so that
        // ANTLR can just write into it.
        //
        File outputDirectory = new File(outputDirectoryPath);
        File libDirectory = new File(libDirectoryPath);

        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
        }

        GrammarDependencies dependencies
                = new GrammarDependencies(sourceDirectory, libDirectory,
                        new LinkedList<String>(), getDependenciesStatusFile(), Logger.getGlobal());

        // Now pick up all the files and process them with the Tool
        //
        List<List<String>> argumentSets;
        Set<File> grammarFiles;
        Set<File> importGrammarFiles;
        try {
            List<String> args = getCommandArguments();
            grammarFiles = getGrammarFiles(sourceDirectory);
            importGrammarFiles = getImportFiles(sourceDirectory, libDirectory);
            argumentSets = processGrammarFiles(args, grammarFiles, dependencies, sourceDirectory, outputDirectory);
        } catch (Exception e) {
            throw new EteException("Fatal error occured while evaluating the names of the grammar files to analyze", e);
        }

        log.info("Output directory base will be " + outputDirectory.getAbsolutePath());
        log.info("ANTLR 4: Processing source directory " + sourceDirectory.getAbsolutePath());
        for (List<String> args : argumentSets) {
            try {
                // Create an instance of the ANTLR 4 build tool
                tool = new CustomTool(args.toArray(new String[args.size()]));
            } catch (Exception e) {
                log.log(Level.SEVERE, "The attempt to create the ANTLR 4 build tool failed, see exception report for details", e);
                throw new EteException("Error creating an instanceof the ANTLR tool.", e);
            }

            try {
                dependencies.analyze(grammarFiles, importGrammarFiles, tool);
            } catch (Exception e) {
                log.log(Level.SEVERE, "Dependency analysis failed, see exception report for details",
                        e);
                throw new EteException("Dependency analysis failed.", e);
            }

            // Set working directory for ANTLR to be the base source directory
            tool.inputDirectory = sourceDirectory;
            tool.libDirectory   = libDirectoryPath;

            tool.processGrammarsOnCommandLine();

            // If any of the grammar files caused errors but did not throw exceptions
            // then we should have accumulated errors in the counts
            if (tool.getNumErrors() > 0) {
                System.out.println("ANTLR 4 caught " + tool.getNumErrors());
//                throw new EteException("ANTLR 4 caught " + tool.getNumErrors() + " build errors.");
            }
        }

//        if (project != null) {
//            // Tell Maven that there are some new source files underneath the output directory.
//            addSourceRoot(this.getOutputDirectory());
//        }
        try {
            dependencies.save();
        } catch (IOException ex) {
            log.log(Level.WARNING, "Could not save grammar dependency status", ex);
        }
    }

    private List<String> getCommandArguments() {
        List<String> args = new ArrayList<String>();

        args.add("-o");
        args.add("target/tmp/");

        args.add("-lib");
        args.add(libDirectoryPath);

        // Next we need to set the options given to us in the pom into the
        // tool instance we have created.
//		if (atn) {
//			args.add("-atn");
//		}
//
//		if ( inputEncoding!=null && !inputEncoding.isEmpty()) {
//			args.add("-encoding");
//			outputEncoding = inputEncoding;
//			args.add(inputEncoding);
//		}
        args.add("-no-listener");
        args.add("-no-visitor");
//        args.add("-Werror");

        if (false) {
            args.add("-Xforce-atn");
        }

        return args;
    }

    /**
     *
     * @param sourceDirectory
     * @exception InclusionScanException
     */
    private List<List<String>> processGrammarFiles(
            List<String> args,
            Set<File> grammarFiles,
            GrammarDependencies dependencies,
            File sourceDirectory,
            File outputDirectory) throws InclusionScanException, IOException {

        // We don't want the plugin to run for every grammar, regardless of whether
        // it's changed since the last compilation. Check the mtime of the tokens vs
        // the grammar file mtime to determine whether we even need to execute.
        Set<File> grammarFilesToProcess = new HashSet<File>();

        for (File grammarFile : grammarFiles) {
            String tokensFileName = grammarFile.getName().split("\\.")[0] + ".tokens";
            File outputFile = new File(outputDirectory, tokensFileName);
            if ((!outputFile.exists())
                    || outputFile.lastModified() <= grammarFile.lastModified()
                    || dependencies.isDependencyChanged(grammarFile)) {
                grammarFilesToProcess.add(grammarFile);
            }
        }

        grammarFiles = grammarFilesToProcess;

        if (grammarFiles.isEmpty()) {
            Logger.getGlobal().info("No grammars to process");
            return Collections.emptyList();
        }

        MultiMap<String, File> grammarFileByFolder = new MultiMap<String, File>();
        // Iterate each grammar file we were given and add it into the tool's list of
        // grammars to process.
        for (File grammarFile : grammarFiles) {

            Logger log = Logger.getGlobal();
            log.log(Level.FINE, "Grammar file '" + grammarFile.getPath() + "' detected.");

            String relPathBase = ActionUtils.findSourceSubdir(sourceDirectory, grammarFile);
            String relPath = relPathBase + grammarFile.getName();
            log.log(Level.FINE, "  ... relative path is: " + relPath);

            grammarFileByFolder.map(relPathBase, grammarFile);
        }

        List<List<String>> result = new ArrayList<List<String>>();
        for (Map.Entry<String, List<File>> entry : grammarFileByFolder.entrySet()) {
            List<String> folderArgs = new ArrayList<String>(args);
            if (!folderArgs.contains("-package") && !entry.getKey().isEmpty()) {
                folderArgs.add("-package");
                folderArgs.add(getPackageName(entry.getKey()));
            }

            for (File file : entry.getValue()) {
                folderArgs.add(entry.getKey() + file.getName());
            }

            result.add(folderArgs);
        }

        return result;
    }

    private Set<File> getImportFiles(File sourceDirectory, File libDirectory) throws InclusionScanException {
        if (!libDirectory.exists()) {
            return Collections.emptySet();
        }

        Set<String> includes = new HashSet<String>();
        includes.add("*.g4");
        includes.add("*.tokens");

        SourceInclusionScanner scan = new SimpleSourceInclusionScanner(includes,
                Collections.<String>emptySet());
        scan.addSourceMapping(new SuffixMapping("G4", "g4"));

        return scan.getIncludedSources(libDirectory, null);
    }

    private Set<File> getGrammarFiles(File sourceDirectory) throws InclusionScanException {
        // Which files under the source set should we be looking for as grammar files
        SourceMapping mapping = new SuffixMapping("g4", Collections.<String>emptySet());

        // What are the sets of includes (defaulted or otherwise).
        Set<String> includes = getIncludesPatterns();

        // Now, to the excludes, we need to add the imports directory
        // as this is autoscanned for imported grammars and so is auto-excluded from the
        // set of grammar fields we should be analyzing.
        excludes.add("imports/**");

        SourceInclusionScanner scan = new SimpleSourceInclusionScanner(includes, excludes);
        scan.addSourceMapping(mapping);

        return scan.getIncludedSources(sourceDirectory, null);
    }

    private static String getPackageName(String relativeFolderPath) {
        if (relativeFolderPath.contains("..")) {
            throw new UnsupportedOperationException("Cannot handle relative paths containing '..'");
        }

        List<String> parts = new ArrayList<String>(Arrays.asList(relativeFolderPath.split("[/\\\\\\.]+")));
        while (parts.remove("")) {
            // intentionally blank
        }

        return Utils.join(parts.iterator(), ".");
    }

    public Set<String> getIncludesPatterns() {
        if (includes == null || includes.isEmpty()) {
            return Collections.singleton("**/*.g4");
        }
        return includes;
    }

    private File getDependenciesStatusFile() {
        File statusFile = new File(statusDirectory, "dependencies.ser");

        if (!statusFile.getParentFile().exists()) {
            statusFile.getParentFile().mkdirs();
        }

        return statusFile;
    }

    public final class CustomTool extends Tool {

        public CustomTool(String[] args) {
            super(args);
//			addListener(new Antlr4ErrorLog(this, buildContext, getLog()));
        }

        @Override
        public void process(Grammar g, boolean gencode) {
            Logger.getGlobal().info("Processing grammar: " + g.fileName);
            super.process(g, gencode);
        }



        @Override
        public Writer getOutputFileWriter(Grammar g, String fileName) throws IOException {
            if (outputDirectory == null) {
                return new StringWriter();
            }
            // output directory is a function of where the grammar file lives
            // for subdir/T.g4, you get subdir here.  Well, depends on -o etc...
            // But, if this is a .tokens file, then we force the output to
            // be the base output directory (or current directory if there is not a -o)
            //
            File outputDir;
            if (fileName.endsWith(CodeGenerator.VOCAB_FILE_EXTENSION)) {
                outputDir = new File(outputDirectory);
            } else {
                outputDir = getOutputDirectory(g.fileName);
            }

            File outputFile = new File(outputDir, fileName);
            if (!outputDir.exists()) {
                outputDir.mkdirs();
            }

//			URI relativePath = project.getBasedir().toURI().relativize(outputFile.toURI());
            URI relativePath = outputFile.toURI();
            Logger.getGlobal().fine("  Writing file: " + relativePath);
//			OutputStream outputStream = buildContext.newFileOutputStream(outputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);
            String outputEncoding = null;
            if (outputEncoding != null && !outputEncoding.isEmpty()) {
                return new BufferedWriter(new OutputStreamWriter(outputStream, outputEncoding));
            } else {
                return new BufferedWriter(new OutputStreamWriter(outputStream));
            }
        }
    }


    /**
     * Validates the given encoding.
     *
     * @return the validated encoding. If {@code null} was provided, returns the
     * platform default encoding.
     */
    private String validateEncoding(String encoding) {
        return (encoding == null) ? Charset.defaultCharset().name() : Charset.forName(encoding.trim()).name();
    }


    
    protected void compile(String inSourceDirectory) {
        
    }
}
