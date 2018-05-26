

package fr.insset.jeanluc.xmi.io.impl;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.Association;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.mofpackage.MofPackage;
import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Should we write it as a visitor ?
 *
 * @author jldeleage
 */
public class ModelWriter extends DynamicVisitorSupport {

    public ModelWriter() {
        this.register("write", "fr.insset.jeanluc.ete.meta.model.mofpackage",
                "fr.insset.jeanluc.ete.meta.model.emof",
                "fr.insset.jeanluc.ete.meta.model.core",
                "java.lang");
    }


    public void writeModel(MofPackage inPackage, File inFile) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, UnsupportedEncodingException, FileNotFoundException {
        writeModel(inPackage, new PrintWriter(new OutputStreamWriter(new FileOutputStream(inFile), "UTF-8")));
    }


    public void writeModel(MofPackage inPackage, PrintWriter output) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        output.println("<?xml version='1.0' encoding='UTF-8'?>");
        output.println();
        output.println("<xmi:XMI xmlns:uml='http://www.omg.org/spec/UML/20131001' xmlns:xmi='http://www.omg.org/spec/XMI/20131001'");
        output.println("         xmlns:StandardProfile='http://www.omg.org/spec/UML/20131001/StandardProfile'");
        output.println("     >");
        output.print("	<uml:Model xmi:type='uml:Model' xmi:id='"
                + inPackage.getId()
                + "' name='Model'>\n");
        for (PackageableElement anElement : inPackage.getPackagedElementAsCollection()) {
            System.out.println("Visiting : " + anElement.getName() + " (" + anElement.getClass().getName() + ")");
            genericVisit(anElement, output, "		", "    ");
        }
        output.println("    </uml:Model>");
        output.println("</xmi:XMI>");
        output.flush();
        output.close();
    }

    public Object writeObject(Object inObject, Object... parameters) {
        PrintWriter output              = (PrintWriter) parameters[0];
        String      initialIndentation  = (String) parameters[1];
        String      indentation         = (String) parameters[2];
        System.out.println("    No visiting method for " + inObject.getClass());
        return inObject;
    }

    public Object writeNamedElement(NamedElement inNamedElement, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        output.print(initialIndentation);
        String xmiType;
        try {
            xmiType = inNamedElement.getXmiType();
        }
        catch (Exception e) {
            return inNamedElement;
        }
        output.print("<packagedElement xmi:type='" + inNamedElement.getXmiType()
                + "' xmi:id='" + inNamedElement.getId());
        String name = inNamedElement.getName();
        if (name != null) {
            output.print("' name='" + inNamedElement.getName());
        }
        output.println("'>");
        for (NamedElement aNamedElement : inNamedElement.getOwnedElements()) {
            genericVisit(aNamedElement, output, initialIndentation + indentation, indentation);
        }
        output.print(initialIndentation);
        output.println("</packagedElement>");
        System.out.println("</packageableElement>");
        return inNamedElement;
    }

    public Object writeMofPackage(MofPackage inPackage, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        output.print(initialIndentation);
        output.println("<packagedElement xmi:type='uml:Package' xmi:id='" + inPackage.getId() + "'>");
        for (NamedElement aNamedElement : inPackage.getPackagedElementAsCollection()) {
            genericVisit(aNamedElement, output, initialIndentation + indentation, indentation);
        }
        output.print(initialIndentation);
        output.println("</packagedElement>");
        return inPackage;
    }


    public Object writeMofClass(MofClass inElement, Object... inParameters) {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        output.print(initialIndentation);
        output.println("<packagedElement xmi:type='uml:Class' xmi:id='"
                + inElement.getId()
                + "' name='" + inElement.getName() + "'>");
        for (Invariant anInvariant : inElement.getInvariants()) {
            writeInvariant(anInvariant, output, initialIndentation + indentation, indentation);
        }
        for (MofProperty aProperty : inElement.getOwnedAttribute()) {
            writeMofProperty(aProperty, output, initialIndentation + indentation, indentation);
        }
        for (MofOperation anOperation : inElement.getOwnedOperation()) {
            writeMofOperation(anOperation, initialIndentation + indentation, indentation);
        }
        output.print(initialIndentation);
        output.println("</packagedElement>");
        return inElement;
    }


    public Object writeMofAssociation(Association inElement, Object... inParameters) {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        output.print(initialIndentation);
        output.println("<packagedElement xmi:type='uml:Association' xmi:id='"
                + inElement.getId()
                + "' name='" + inElement.getName() + "'>");
        
        return inElement;
    }


    public Object writeMofProperty(MofProperty inElement, Object... inParameters) {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        output.print(initialIndentation);
        output.println("<ownedAttribute xmi:type='uml:Property' xmi:id='"
                + inElement.getId());
        String name = inElement.getName();
        if (name != null) {
            output.print("' name='" + inElement.getName());
        }
        output.println("'>");
        MofType type = inElement.getType();
        if (type instanceof MofClass) {
            
        }
        output.print(initialIndentation);
        output.println("</ownedAttribute>");
        return inElement;
    }


    public Object writeMofOperation(MofOperation inElement, Object... inParameters) {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        output.print(initialIndentation);
        output.println("<ownedOperation xmi:type='uml:Property' xmi:id='"
                + inElement.getId()
                + "' name='" + inElement.getName() + "'>");
        output.print(initialIndentation);
        output.println("</ownedOperation>");
        return inElement;
    }


    /**
     * 
     * @param inElement
     * @param inParameters
     * @return 
     */
    public Object writeInvariant(Invariant inElement, Object... inParameters) {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        output.print(initialIndentation);
        output.println("<ownedRule xmi:type='uml:Constraint' xmi:id='"
                + inElement.getId()
                + "' name='" + inElement.getName() + "'>");
        output.print(initialIndentation);
        output.print(indentation);
        output.println("<constrainedElement xmi:idref='" + inElement.getContext().getId() + "'/>");
        output.print(initialIndentation);
        output.print(indentation);
        output.print(indentation);
        output.println("<specification xmi:type='uml:OpaqueExpression' xmi:id='" + inElement.getId() + "'>");
        output.print(initialIndentation);
        output.print(indentation);
        output.print(indentation);
        output.print(indentation);
        output.println("<body>" + inElement.getSpecificationAsString() + "</body>");
        output.print(initialIndentation);
        output.print(indentation);
        output.print(indentation);
        output.println("</specification>");
        output.print(initialIndentation);
        output.println("</ownedRule>");
        return inElement;
    }



    public void printStart(NamedElement inElement, Object... inParameters) {
        
    }
}

