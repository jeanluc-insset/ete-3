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
public class AssignmentImpl  extends fr.insset.jeanluc.ete.as.impl.StatementImpl  implements Assignment {

    public AssignmentImpl() {
    }


    //========================================================================//





    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public  fr.insset.jeanluc.gel.GelExpression getValue() {
        return value;
    }

    public void setValue( fr.insset.jeanluc.gel.GelExpression inValue) {
        value = inValue;
    }

    
        
    public  fr.insset.jeanluc.gel.GelExpression getLeftValue() {
        return leftValue;
    }

    public void setLeftValue( fr.insset.jeanluc.gel.GelExpression inValue) {
        leftValue = inValue;
    }

    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private  fr.insset.jeanluc.gel.GelExpression value;
            private  fr.insset.jeanluc.gel.GelExpression leftValue;
    




}


