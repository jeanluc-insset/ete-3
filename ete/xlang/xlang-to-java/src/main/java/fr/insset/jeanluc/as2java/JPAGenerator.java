package fr.insset.jeanluc.as2java;


import fr.insset.jeanluc.action.semantics.builder.EnhancedMofClassImpl;
import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.el.dialect.JavaDialect;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Includes;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Self;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.impl.*;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
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


    public String   getJava(EteFilter aFilter) {
        return getJava(aFilter, "        ");
    }
    
    public String getJava(EteFilter aFilter, String inIndentation) {
        StringBuilder   builder = new StringBuilder();
        return builder.toString();
    }


    //========================================================================//


    private     String                 indentation;


}       // JpaGenerator
