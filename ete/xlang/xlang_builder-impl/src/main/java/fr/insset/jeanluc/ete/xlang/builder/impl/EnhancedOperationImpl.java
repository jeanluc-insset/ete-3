package fr.insset.jeanluc.ete.xlang.builder.impl;

import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.builder.*;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;



public abstract class EnhancedOperationImpl  extends fr.insset.jeanluc.ete.meta.model.emof.impl.MofOperationImpl  implements EnhancedOperation {


    //========================================================================//


    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> inValue) {
        statements = inValue;
    }



    //========================================================================//


    private List<Statement> statements;


}


