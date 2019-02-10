package fr.insset.jeanluc.plain.text.io;

import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.meta.model.io.ModelWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class TextModelWriter implements ModelWriter {


    private static final String     INDENT = "- ";


    @Override
    public void writeModel(MofPackage inModel, OutputStream inOutput) throws UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(inOutput, "UTF-8"));
        writeRecursive(inModel, pw, INDENT);
        pw.flush();
    }


    protected   void writeRecursive(MofPackage inPackage, PrintWriter inOutput, String inIndent) {
        inOutput.print(inIndent);
        inOutput.println(inPackage.getName());
        inIndent += INDENT;
        Collection<MofPackage> packages = inPackage.getPackages();
        for (MofPackage p : packages) {
            writeRecursive(p, inOutput, inIndent);
        }
        Collection<MofClass> classes = inPackage.getClasses();
        for (MofClass c : classes) {
            writeRecursive(c, inOutput, inIndent);
        }
    }


    protected   void writeRecursive(MofClass inClass, PrintWriter inOutput, String inIndent) {
        inOutput.print(inIndent);
        inOutput.println(inClass.getName());
        inIndent += INDENT;
        for (MofProperty p : inClass.getOwnedAttribute()) {
            writeRecursive(p, inOutput, inIndent);
        }
        for (MofOperation op : inClass.getOwnedOperation()) {
            writeRecursive(op, inOutput, inIndent);
        }
    }


    protected void writeRecursive(MofProperty inProperty, PrintWriter inOutput, String inIndent) {
        
    }

    private void writeRecursive(MofOperation op, PrintWriter inOutput, String inIndent) {
    }


}
