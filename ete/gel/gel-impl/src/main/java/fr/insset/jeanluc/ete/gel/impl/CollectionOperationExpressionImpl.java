package fr.insset.jeanluc.ete.gel.impl;

import fr.insset.jeanluc.ete.gel.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;



public class CollectionOperationExpressionImpl  extends fr.insset.jeanluc.ete.gel.impl.NavigationImpl  implements CollectionOperationExpression {


    //========================================================================//


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String inValue) {
        identifier = inValue;
    }


    //========================================================================//


    private String identifier;


}


