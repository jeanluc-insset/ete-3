package fr.insset.jeanluc.ete.as.impl;


// import fr.insset.jeanluc.ete.meta.model.emof.Feature;
// import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
import fr.insset.jeanluc.ete.as.*;
import fr.insset.jeanluc.gel.GelExpression;
// import fr.insset.jeanluc.gel.GelExpression;
// import fr.insset.jeanluc.gel.impl.NavigableImpl;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class MethodInvocationImpl  implements MethodInvocation {

    public MethodInvocationImpl() {
    }


    //========================================================================//





    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public  fr.insset.jeanluc.ete.meta.model.emof.MofOperation getMethod() {
        return method;
    }

    public void setMethod( fr.insset.jeanluc.ete.meta.model.emof.MofOperation inValue) {
        method = inValue;
    }

    
        
    public  fr.insset.jeanluc.gel.GelExpression getTarget() {
        return target;
    }

    public void setTarget( fr.insset.jeanluc.gel.GelExpression inValue) {
        target = inValue;
    }

    
        
    @Override
    public List<GelExpression> getParameters() {
        return parameters;
    }

    public void setParameters(List<GelExpression> inValue) {
        parameters = inValue;
    }

        public void addParameters(GelExpression inValue) {
        parameters.add(inValue);
    }
    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private  fr.insset.jeanluc.ete.meta.model.emof.MofOperation method;
            private  fr.insset.jeanluc.gel.GelExpression target;
            private List<GelExpression> parameters = new LinkedList<>();
    




}


