

package fr.insset.jeanluc.xmi.io.impl;

import fr.insset.jeanluc.ete.api.ActionSupport;
import fr.insset.jeanluc.ete.api.EteException;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.core.NamedElement;
import fr.insset.jeanluc.ete.meta.model.emof.AggregationKind;
import static fr.insset.jeanluc.ete.meta.model.emof.AggregationKind.AGGREGATION;
import static fr.insset.jeanluc.ete.meta.model.emof.AggregationKind.COMPOSITION;
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
            if (! (anElement instanceof MofPackage)) {
                continue;
            }
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
        printStart(inPackage, output, initialIndentation, "packagedElement", "uml:Package");
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
        String      indentation                 = (String) inParameters[2];
        printStart(inElement, output, initialIndentation, "packagedElement", "uml:Class");
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
        printStart(inElement, output, initialIndentation, "packagedElement", "uml:Association");
        output.print(initialIndentation);
        output.print("</packagedElement>");
        return inElement;
    }


    public Object writeMofProperty(MofProperty inElement, Object... inParameters) {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        printUncompleteStart(inElement, output, initialIndentation, "ownedAttribute", "uml:Property");
        MofType type = inElement.getType();
        if (type instanceof MofClass) {
            AggregationKind aggregationKind = inElement.getAggregationKind();
            if (COMPOSITION.equals(aggregationKind)) {
                    output.print("' aggregation='composition");
            } else if (AGGREGATION.equals(aggregationKind)) {
                    output.print("' aggregation='aggregation");
            }
        }
        if (inElement.isOrdered()) {
            output.print("' isOrdered='true");
        }
        if (inElement.isStatic()) {
            output.print("' static='true");
        }
        if (inElement.isDerived()) {
            // TODO : derived attributes
        }
        output.println("'>");
        output.print(initialIndentation);
        output.println("</ownedAttribute>");
        return inElement;
    }


    public Object writeMofOperation(MofOperation inElement, Object... inParameters) {
        PrintWriter output              = (PrintWriter) inParameters[0];
        String      initialIndentation  = (String) inParameters[1];
        String      indentation         = (String) inParameters[2];
        printStart(inElement, output, initialIndentation, "ownedOperation", "uml:Operation");
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
        printStart(inElement, output, initialIndentation, "ownedRule", "uml:Constraint");
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
        output.println("<body>" + inElement.getSpecificationAsString().replace("<", "&lt;").replace(">", "&gt") + "</body>");
        output.print(initialIndentation);
        output.print(indentation);
        output.print(indentation);
        output.println("</specification>");
        output.print(initialIndentation);
        output.println("</ownedRule>");
        return inElement;
    }


    public void printUncompleteStart(NamedElement inElement, PrintWriter output, String initialIndentation, String xmlType, String xmiType) {
        output.print(initialIndentation);
        output.print('<');
        output.print(xmlType);
        output.print(" xmi:type='" + xmiType + "' xmi:id='"
                + inElement.getId());
        String name = inElement.getName();
        if (name != null) {
            output.print("' name='" + name);
        }
    }

    public void printStart(NamedElement inElement, PrintWriter output, String initialIndentation, String xmlType, String xmiType) {
        printUncompleteStart(inElement, output, initialIndentation, xmlType, xmiType);
        output.println("'>");
    }


}

