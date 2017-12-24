package fr.insset.jeanluc.gel.impl;


import fr.insset.jeanluc.gel.*;
import java.lang.Object;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Generated;



@Generated("ete - jean-luc@insset.fr  ete-toolchain/src/main/mda/modules/java/impl.vm")
public class VariableDefinitionImpl  extends fr.insset.jeanluc.gel.impl.GelExpressionImpl  implements VariableDefinition {

    public VariableDefinitionImpl() {
    }


    //========================================================================//





    //========================================================================//
    //                A C C E S S O R S   and   M U T A T O R S               //
    //========================================================================//



    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String inValue) {
        identifier = inValue;
    }

    
        
    public  java.lang.Object getValue() {
        return value;
    }

    public void setValue( java.lang.Object inValue) {
        value = inValue;
    }

    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private String identifier;
            private  java.lang.Object value;
    




}


