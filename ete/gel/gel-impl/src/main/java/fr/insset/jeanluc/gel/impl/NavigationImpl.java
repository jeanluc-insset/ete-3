package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;
import fr.insset.jeanluc.gel.Navigable;
import fr.insset.jeanluc.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class NavigationImpl  extends fr.insset.jeanluc.gel.impl.NavigableImpl  implements Navigation {

    public NavigationImpl() {
    }


    //========================================================================//





    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public  fr.insset.jeanluc.ete.meta.model.emof.Feature getToFeature() {
        return toFeature;
    }

    public void setToFeature( fr.insset.jeanluc.ete.meta.model.emof.Feature inValue) {
        toFeature = inValue;
    }

    
        
    public  fr.insset.jeanluc.gel.Navigable getFrom() {
        return from;
    }

    public void setFrom( fr.insset.jeanluc.gel.Navigable inValue) {
        from = inValue;
    }

    
        
    public List<GelExpression> getParameter() {
        return parameter;
    }

    public void setParameter(List<GelExpression> inValue) {
        parameter = inValue;
    }

        public void addParameter(GelExpression inValue) {
        parameter.add(inValue);
    }
    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private  fr.insset.jeanluc.ete.meta.model.emof.Feature toFeature;
            private  fr.insset.jeanluc.gel.Navigable from;
            private List<GelExpression> parameter = new LinkedList<>();
    




}


