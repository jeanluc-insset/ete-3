package fr.insset.jeanluc.xlang.to.sql;

import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.action.semantics.builder.EteFilter;
import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.xlang.to.xxx.Generator;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class SqlGenerator  extends DynamicVisitorSupport implements Generator {


    public SqlGenerator() {
        System.out.println("The SQL dialect has been loaded");
        register(Nav.class, "visitNav");
    }


    //==========================================================================//
    //                              Q U E R I E S                               //
    //==========================================================================//
    // An EteFilter is translated to a SELECT clause.
    // A navigation from the target Entity is translated to an INNER JOIN clause.


    public StringBuffer   getSql(EteFilter inQuery) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        StringBuffer buffer = new StringBuffer("SELECT r FROM ");
        String name = inQuery.getFilteredProperty().getType().getName().toUpperCase();
        buffer.append(name);
        buffer.append(" as r");
        genericVisit(inQuery.getExpression(), buffer);
        return buffer;
    }


    /**
     * 
     * @param inNav
     * @param inParam
     * @return 
     */
    public Nav      visitNav(Nav inNav, Object... inParam) {
        StringBuffer    buffer = (StringBuffer) inParam[0];
        buffer.append(" INNER JOIN ");
        List<GelExpression> operand = inNav.getOperand();
//        buffer.append(inNav.getOperand().get(0));
        return inNav;
    }



    //==========================================================================//
    //                              F I L T E R S                               //
    //==========================================================================//


    public String getFilter(EteFilter inFilter, boolean inFirstOne) {
        StringBuffer buffer = new StringBuffer();
        if (inFirstOne) {
            buffer.append("where ");
        } else {
            buffer.append("and ");
        }
        return buffer.toString();
    }



}       // SQLGenerator
