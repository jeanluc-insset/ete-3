package fr.insset.jeanluc.xlang.to.sql;

import fr.insset.jeanluc.ete.gel.AttributeNav;
import fr.insset.jeanluc.ete.xlang.to.xxx.Generator;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;

/**
 *
 * @author jldeleage
 */
public class SqlGenerator  extends DynamicVisitorSupport implements Generator {

    public SqlGenerator() {
        System.out.println("The SQL dialect has been loaded");
    }


//    public String   getSql(EteQuery inQuery) {
//        StringBuffer buffer = new StringBuffer("SELECT p FROM PILOT AS p");
//        buffer.append(';');
//        return buffer.toString();
//    }
//
//
//    public String addJoins(EteQuery inQuery) {
//        StringBuffer    buffer = new StringBuffer();
//        
//        return buffer.toString();
//    }





}       // SQLGenerator
