package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofOperationImpl;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.List;
import java.util.Map;



/**
 * This class implements MofOperation subclassing MofOperationImpl and
 * adding the ability to store lists of statements.<br>
 * 
 * In order to be used, this class must be registered in the FactoryRegistry
 * with the "Operation" key before reading the model.<br>
 * This registration is made when the ActionSemanticsAction class is loaded so
 * registering that action does the job.
 *
 * @author jldeleage
 */
public class EnhancedMofOperationImpl extends MofOperationImpl implements EnhancedMofOperation {

    
    public EnhancedMofOperationImpl() throws InstantiationException {
        statements = FactoryMethods.newList(Statement.class);
    }




    @Override
    public List<Statement> getBody() {
        return getStatements();
    }


    @Override
    public void setBody(List<Statement> inStatements) {
        setStatements(inStatements);
    }


    @Override
    public Map<GelExpression, VariableDeclaration> getLocalVariables() {
        return localVariables;
    }

    public void setLocalVariables(Map<GelExpression, VariableDeclaration> localVariables) {
        this.localVariables = localVariables;
    }


    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }


    //========================================================================//


    private     List<Statement>                         statements;
    private     Map<GelExpression, VariableDeclaration> localVariables;


}

