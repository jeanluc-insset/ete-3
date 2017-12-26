package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.as.Statement;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofOperationImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * This class implements MofOperation subclassing MofOperationImpl and
 * adding the ability to store lists of statements.<br>
 * 
 * To analyze operation specifications one must register this class for the
 * Operation key.
 *
 * @author jldeleage
 */
public class EnhancedMofOperationImpl extends MofOperationImpl {


    public EnhancedMofOperationImpl() throws InstantiationException {
        Map plainMap = FactoryMethods.newMap(String.class, List.class);
        statements = plainMap;
    }


    public EnhancedMofOperationImpl(Map<String, List<Statement>> statements) throws InstantiationException {
        this.statements = statements;
    }

    public Map<String, List<Statement>> getStatements() {
        return statements;
    }

    public void setStatements(Map<String, List<Statement>> statements) {
        this.statements = statements;
    }


    private     Map<String, List<Statement>>    statements;

}

