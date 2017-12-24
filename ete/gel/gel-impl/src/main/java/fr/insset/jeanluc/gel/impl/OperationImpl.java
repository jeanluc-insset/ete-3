package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class OperationImpl  extends fr.insset.jeanluc.gel.impl.GelExpressionImpl  implements Operation {

    public OperationImpl() {
    }


    //========================================================================//





    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public List<GelExpression> getOperand() {
        return operand;
    }

    public void setOperand(List<GelExpression> inValue) {
        operand = inValue;
    }

        public void addOperand(GelExpression inValue) {
        operand.add(inValue);
    }
    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private List<GelExpression> operand = new LinkedList<>();
    




}


