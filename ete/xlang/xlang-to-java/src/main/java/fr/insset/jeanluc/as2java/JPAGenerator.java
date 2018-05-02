package fr.insset.jeanluc.as2java;




import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
import fr.insset.jeanluc.action.semantics.builder.EnhancedMofOperation;
import fr.insset.jeanluc.action.semantics.builder.EteQuery;
import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.Different;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Includes;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.StringLiteral;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.constraint.Condition;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Conditional;
import fr.insset.jeanluc.ete.xlang.DoWhileLoop;
import fr.insset.jeanluc.ete.xlang.ForLoop;
import fr.insset.jeanluc.ete.xlang.Instanciation;
import fr.insset.jeanluc.ete.xlang.MethodInvocation;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.WhileDoLoop;
import fr.insset.jeanluc.ete.xlang.to.xxx.Generator;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * This class is a dialect so it can be used in velocity templates.<br>
 * It overrides the getOperationBody method with the cross compilation of
 * all the statements associated to the method.
 *
 * @author jldeleage
 */
public class JPAGenerator extends DynamicVisitorSupport implements Generator, JavaDialect  {


    private enum LEFT_RIGHT {
        LEFT, RIGHT
    };



    public JPAGenerator() throws InstantiationException {
        this("    ");
    }


    public JPAGenerator(String indentation) throws InstantiationException {
        this.indentation = indentation;
        register("visit", "fr.insset.jeanluc.ete.gel");
        register("visit", "fr.insset.jeanluc.ete.xlang");
    }


    //========================================================================//
    //            G E N E R A T O R   I M P L E M E N T A T I O N             //
    //========================================================================//



    //========================================================================//
    //                              D I A L E C T                             //
    //========================================================================//

//
//    public String getJpa(EnhancedMofClassImpl inClass) {
//        StringBuffer    buffer = new StringBuffer();
//        for (MofProperty aProperty : inClass.getSupport().keySet()) {
//            getJpa(inClass, aProperty, buffer);
//        }
//        return buffer.toString();
//    }
//
//    protected void getJpa(EnhancedMofClassImpl inClass, MofProperty inProperty, StringBuffer buffer) {
//        String   propertyName = i2uc(inProperty.getName());
//        MofClass propertyOWningClass = (MofClass) inProperty.getOwningMofClass();
//        buffer.append(indentation);
//        buffer.append("public List<");
//        buffer.append(inClass.getName());
//        buffer.append("> get");
//        buffer.append(propertyName);
//        buffer.append("For");
//        buffer.append(propertyOWningClass.getName());
//        buffer.append("(");
//        buffer.append(") {\n");
//        String indentation = this.indentation + this.indentation;
//        inClass.getSupport().get(inProperty);
//        inProperty.getName();
//        buffer.append(indentation);
//    }
//
//
//    public void getJpa(EteQuery inQuery, StringBuilder buffer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        MofType type = inQuery.getTargetVariable().getType();
//        System.out.println("Trying to generate query");
//        String  indentation = getIndentation();
//        buffer.append(indentation);
//        buffer.append("public CriteriaQuery select");
//        buffer.append(i2uc(inQuery.getPropertyName()));
//        buffer.append("(CriteriaQuery<");
//        buffer.append(type.getName());
//        buffer.append("> inoutQuery, ");
//        buffer.append(inQuery.getClientClass().getName());
//        buffer.append(" inClient) {\n");
//        indentation += indentation;
//        buffer.append(indentation);
//        buffer.append("CriteriaBuilder  cb = getCriteriaBuilder();\n");
//        buffer.append(indentation);
//        buffer.append("Root<");
//        buffer.append("> root = inoutQuery.getRoot();\n");
//        buffer.append(indentation);
//        buffer.append("Predicate predicate = \n");
//        buffer.append(indentation);
//        buffer.append(indentation);
//        genericVisit(inQuery.getExpression(), buffer, inQuery, indentation, type);
//        buffer.append(";\n");
//        buffer.append(indentation);
//        buffer.append("return inoutQuery;\n");
//        indentation = getIndentation();
//        buffer.append(indentation);
//        buffer.append("}\n\n");
//    }


    public String getJpa(VariableDeclaration inDeclaration) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        GelExpression initValue = inDeclaration.getInitValue();
        System.out.println("InitValue : " + initValue + " (" + initValue.getClass().getName() + ")");
        StringBuffer buffer = new StringBuffer();
        genericVisit(initValue, buffer, "");
        return buffer.toString();
    }


    //========================================================================//
    //            V I S I T S   O F   G E L   E X P R E S S I O N S           //
    //========================================================================//


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) {
        System.out.println("Visiting a plain gel expression");
        StringBuffer buffer = (StringBuffer) inParameters[0];
        String indentation = (String) inParameters[1];
        buffer.append(indentation);
        buffer.append(indentation);
        buffer.append("\n");
        return inExpression;
    }


    public VariableDeclaration visitVariableDeclaration(VariableDeclaration inDeclaration, Object... inParameters) {
        System.out.println("Visiting a variable declaration");
        StringBuffer buffer = (StringBuffer) inParameters[0];
        buffer.append(inDeclaration.getName());
        return inDeclaration;
    }


    public Self visitSelf(Self inSelf, Object... inParameters) {
        System.out.println("Visiting self");
        StringBuffer buffer = (StringBuffer) inParameters[0];
        buffer.append("inFor");
        return inSelf;
    }


    public AttributeNav visitAttributeNav(AttributeNav inNav, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("Visiting a navigation to ");
        System.out.println(inNav.getToFeature().getName());
        StringBuffer buffer = (StringBuffer) inParameters[0];
        System.out.println("Visiting an attribute navigation");
        List<GelExpression> operand = inNav.getOperand();
        GelExpression firstOperand = operand.get(0);
        genericVisit(firstOperand, inParameters);
        buffer.append(".get");
        String name = inNav.getToFeature().getName();
        name = i2uc(name);
        buffer.append(name);
        buffer.append("()");
        return inNav;
    }



    public Includes visitIncludes(Includes inIncludes, Object... inParameters) {
        return inIncludes;
    }

    
    //========================================================================//
    //
    //========================================================================//




    public String getIndentation() {
        return indentation;
    }



    //========================================================================//
    //========================================================================//

    String      indentation;

}       // JpaGenerator
