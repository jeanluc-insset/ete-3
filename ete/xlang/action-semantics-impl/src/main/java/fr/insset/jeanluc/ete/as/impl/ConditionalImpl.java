package fr.insset.jeanluc.ete.as.impl;


// import fr.insset.jeanluc.ete.meta.model.emof.Feature;
// import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;
import fr.insset.jeanluc.ete.as.*;
// import fr.insset.jeanluc.gel.GelExpression;
// import fr.insset.jeanluc.gel.impl.NavigableImpl;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class ConditionalImpl  extends fr.insset.jeanluc.ete.as.impl.StatementImpl  implements Conditional {

    public ConditionalImpl() {
    }


    //========================================================================//





    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public  fr.insset.jeanluc.gel.GelExpression getCondition() {
        return condition;
    }

    public void setCondition( fr.insset.jeanluc.gel.GelExpression inValue) {
        condition = inValue;
    }

    
        
    public  fr.insset.jeanluc.ete.as.Statement getThenPart() {
        return thenPart;
    }

    public void setThenPart( fr.insset.jeanluc.ete.as.Statement inValue) {
        thenPart = inValue;
    }

    
        
    public  fr.insset.jeanluc.ete.as.Statement getElsePart() {
        return elsePart;
    }

    public void setElsePart( fr.insset.jeanluc.ete.as.Statement inValue) {
        elsePart = inValue;
    }

    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private  fr.insset.jeanluc.gel.GelExpression condition;
            private  fr.insset.jeanluc.ete.as.Statement thenPart;
            private  fr.insset.jeanluc.ete.as.Statement elsePart;
    




}


