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
public class VariableDeclarationImpl  extends fr.insset.jeanluc.ete.as.impl.StatementImpl  implements VariableDeclaration {

    public VariableDeclarationImpl() {
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

    
        
    public  fr.insset.jeanluc.gel.VariableDefinition getDefinitionExpression() {
        return definitionExpression;
    }

    public void setDefinitionExpression( fr.insset.jeanluc.gel.VariableDefinition inValue) {
        definitionExpression = inValue;
    }

    
        
    public  fr.insset.jeanluc.gel.GelExpression getInitValue() {
        return initValue;
    }

    public void setInitValue( fr.insset.jeanluc.gel.GelExpression inValue) {
        initValue = inValue;
    }

    
    

    //========================================================================//
    //                           O P E R A T I O N S                          //
    //========================================================================//




    //========================================================================//
    //                   I N S T A N C E   V A R I A B L E S                  //
    //========================================================================//


        private String identifier;
            private  fr.insset.jeanluc.gel.VariableDefinition definitionExpression;
            private  fr.insset.jeanluc.gel.GelExpression initValue;
    




}


