package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;
import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class LambdaImpl  extends fr.insset.jeanluc.gel.impl.BinaryOperationImpl  implements Lambda {

    public LambdaImpl() {
    }


    //========================================================================//


    public String getSymbol() {
        return "|";
    }
    public String getJavaOperator() {
        return "=";
    }



    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public List<VariableDefinition> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableDefinition> inValue) {
        variables = inValue;
    }

        public void addVariables(VariableDefinition inValue) {
        variables.add(inValue);
    }
    
        
    public  fr.insset.jeanluc.gel.GelExpression getBody() {
        return body;
    }

    public void setBody( fr.insset.jeanluc.gel.GelExpression inValue) {
        body = inValue;
    }

    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private List<VariableDefinition> variables = new LinkedList<>();
            private  fr.insset.jeanluc.gel.GelExpression body;
    




}


