package fr.insset.jeanluc.as2java;


import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.action.semantics.builder.EteQuery;
import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Includes;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.impl.*;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.to.xxx.Generator;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 * This class is intented to be used in velocity templates.<br>
 * It provides the body of methods which call SQL queries
 *
 * @author jldeleage
 */
public class JPAGenerator implements Generator, JavaDialect  {

    public final static Level       LOG_LEVEL = Level.INFO;

    public JPAGenerator() throws InstantiationException {
        this("    ");
    }


    public JPAGenerator(String indentation) throws InstantiationException {
        this.indentation = indentation;
    }


    //========================================================================//
    //                              D I A L E C T                             //
    //========================================================================//


    public String   getValueOfParameter(VariableDefinition inDef) {
        StringBuilder   builder = new StringBuilder();
        GelExpression expression = (GelExpression) inDef.getValue();
        addNavigation(expression, builder);
        return builder.toString();
    }


    protected void addNavigation(GelExpression aStep, StringBuilder builder) {
        if (aStep instanceof Self) {
            builder.append("inFor");
        }
        List<GelExpression> operand = aStep.getOperand();
        if (operand == null || operand.size() == 0) {
            return;
        }
        GelExpression previous = operand.get(0);
        addNavigation(previous, builder);
        builder.append(".get");
        Step thisStep = (Step) aStep;
        Feature toFeature = thisStep.getToFeature();
        builder.append(i2uc(toFeature.getName()));
        if (previous instanceof Self) {
            builder.append('$');
        }
        builder.append("()");
    }


    public String   getDependentProperties(MofProperty inProperty) {
        System.out.println("    the dialect is asked for the dependences of " + inProperty.getName());
        StringBuilder   builder = new StringBuilder();
        MofType type = inProperty.getType().getRecBaseType();
        if (type instanceof EnhancedMofClassImpl) {
            EnhancedMofClassImpl theClass = (EnhancedMofClassImpl) type;
            Map<MofProperty, EteQuery> support = theClass.getSupport();
            EteQuery query = support.get(inProperty);
            List<MofProperty> dependencies = query.getDependencies();
            for (MofProperty aProperty : dependencies) {
//                if (aProperty.getOwningMofClass().equals(inProperty.getOwningMofClass()))
                    builder.append(aProperty.getName());
                    builder.append(' ');
            }
        }
        return builder.toString();
    }



    //========================================================================//


    private     String                 indentation;


}       // JpaGenerator
