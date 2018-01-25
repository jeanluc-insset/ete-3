/**
 * Copyright 2015 Santhosh Kumar Tekuri 
 * 
 * The JLibs authors license this file to you under the Apache License, 
 * version 2.0 (the "License"); you may not use this file except in compliance 
 * with the License. You may obtain a copy of the License at: 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License. 
 */
 
package jlibs.core.i18n; 
 
//import jlibs.core.io.IOUtil; 
//import jlibs.core.lang.ClassUtil; 
//import jlibs.core.net.URLUtil; 
//import jlibs.core.util.i18n.I18N; 
//import org.testng.Assert; 
//import org.testng.annotations.Test; 
 
//import javax.tools.JavaCompiler; 
//import javax.tools.ToolProvider; 
//import java.io.ByteArrayOutputStream; 
//import java.io.IOException; 
//import java.net.URL; 
//import java.util.ArrayList; 
//import org.junit.Assert;
//import org.junit.Test;
// 
////import static jlibs.core.i18n.Bundle1.BUNDLE1; 
////import static jlibs.core.i18n.Bundle2.BUNDLE2; 
// 
///**
// * @author Santhosh Kumar T 
// */ 
//public class ResourceBundleTest{ 
//    private String compile(String... files){ 
//        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler(); 
//        ArrayList<String> args = new ArrayList<String>(); 
//        args.add("-d");
//        args.add(ClassUtil.getClassPath(getClass())); 
//        args.add("-s"); 
//        args.add(ClassUtil.getClassPath(getClass())); 
//        for(String file: files){ 
//            URL url = getClass().getResource(file); 
//            args.add(URLUtil.toSystemID(url)); 
//        } 
//        ByteArrayOutputStream err = new ByteArrayOutputStream(); 
//        if(compiler.run(null, null, err, args.toArray(new String[args.size()]))==0) 
//            return null; 
//        return err.toString(); 
//    } 
// 
//    private void assertErrors(String errors, String... searchFor){ 
//        if(searchFor.length==0) 
//            Assert.assertNull(errors, "compilation failed with errors:\n"+errors); 
//        else{ 
//            errors = errors.replace('\\', '/'); 
//            errors = errors.replace("\r\n", "\n"); 
//            for(String error: searchFor){ 
//                if(errors.indexOf(error)==-1) 
//                    Assert.fail("[Expected Error] "+error+"\n[Actual Error] "+errors); 
//            } 
//        } 
//    } 
// 
//    @Test() 
//    public void classBundle(){ 
//        assertErrors(compile("/i18n/ClassBundle.java"), 
//            "i18n/ClassBundle.java:12: jlibs.core.util.i18n.ResourceBundle annotation can be applied only for interface\n" + 
//                "public abstract class ClassBundle{\n" + 
//                    "                ^" 
//        ); 
//    } 
// 
//    @Test() 
//    public void missingMessageAnnotation(){ 
//        assertErrors(compile("/i18n/MissingMessageAnnotationBundle.java"), 
//            "i18n/MissingMessageAnnotationBundle.java:", 
//            ": jlibs.core.util.i18n.Message annotation is missing on this method\n" + 
//                    "    public String lastSucussfullLogin(Date date);\n" + 
//                    "                  ^" 
//        ); 
//    } 
// 
//    @Test() 
//    public void invalidMethodReturn(){ 
//        assertErrors(compile("/i18n/InvalidMethodReturnBundle.java"), 
//            "i18n/InvalidMethodReturnBundle.java:14: method annotated with jlibs.core.util.i18n.Message must return java.lang.String or a subclass of java.lang.Throwable\n" + 
//                    "    public Date lastSucussfullLogin(Date date);\n" + 
//                    "                ^" 
//        ); 
//    } 
// 
//    @Test() 
//    public void invalidMessageFormat(){ 
//        assertErrors(compile("/i18n/InvalidMessageFormatBundle.java"), 
//            "Invalid Message Format: unknown format type at" 
//        ); 
//    } 
// 
//    @Test() 
//    public void argumentCountMismatch(){ 
//        assertErrors(compile("/i18n/ArgumentCountMismatchBundle.java"), 
//            "no of args in message format doesn't match with the number of parameters this method accepts" 
//        ); 
//    } 
// 
//    @Test() 
//    public void missingArgument(){ 
//        assertErrors(compile("/i18n/MissingArgumentBundle.java"), 
//            "/i18n/MissingArgumentBundle.java:", 
//            ": {1} is missing in message\n" + 
//                    "    @Message(\"SQL Execution completed in {0} seconds with {2} errors and {2} warnings\")\n" + 
//                    "    ^" 
//        ); 
//    } 
// 
//    @Test() 
//    public void duplicateKeyInSameFile(){ 
//        assertErrors(compile("/i18n/DuplicateKeyBundle.java"), 
//            "key 'JLIBS015' is already used by \"public java.lang.String executionFinished(long, int, int)\" in i18n.DuplicateKeyBundle interface" 
//        ); 
//    } 
// 
//    @Test() 
//    public void duplicateKeyAcrossFiles(){ 
//        assertErrors(compile("/i18n/DuplicateKey1Bundle.java", "/i18n/DuplicateKey2Bundle.java"), 
//            "key 'JLIBS015' is already used by \"public java.lang.String executionFinished(long, int, int)\" in i18n.DuplicateKey1Bundle interface" 
//        ); 
//    } 
// 
//    @Test() 
//    public void methodSignatureClash(){ 
//        assertErrors(compile("/i18n/MethodSignatureClash1Bundle.java", "/i18n/MethodSignatureClash2Bundle.java"), 
//        "i18n/MethodSignatureClash2Bundle.java:12: clashes with similar method in i18n.MethodSignatureClash1Bundle interface\n" + 
//        "    public String executing(String query);" 
//        ); 
//    } 
// 
////    @Test() 
////    public void testImplementation(){ 
////        Assert.assertEquals(BUNDLE1.executing("myquery"), "executing myquery"); 
////        Assert.assertEquals(BUNDLE2.executed("myquery"), "executed myquery"); 
////    } 
//// 
////    @Test() 
////    public void testCustomKey(){ 
////        Assert.assertEquals(BUNDLE1.executionTook(10), "execution took 10 seconds"); 
////        Assert.assertEquals(I18N.getValue(Bundle1.class, "timeTaken", 10), "execution took 10 seconds"); 
////    } 
// 
////    @Test() 
////    public void testDocumentation() throws IOException{ 
////        String props = IOUtil.pump(Bundle1.class.getResourceAsStream("Bundle.properties"), true).toString(); 
////        props = props.replace("\r\n", "\n"); 
////        if(props.indexOf("# {0} query\nexecuted=executed {0}")==-1) 
////            Assert.fail("documentation must be generated for method with no javadoc"); 
////        if(props.indexOf("# {0} time ==> time taken in seconds\ntimeTaken=execution took {0, number} seconds")==-1) 
////            Assert.fail("documentation must be generated for method with javadoc"); 
////        if(props.indexOf("# {0} query\nexecuting=executing {0}")==-1) 
////            Assert.fail("documentation must be generated for method with javadoc with no param description"); 
////    } 
//}