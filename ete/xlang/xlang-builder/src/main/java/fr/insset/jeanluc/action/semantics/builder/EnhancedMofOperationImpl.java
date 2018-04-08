package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofOperationImpl;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collections;
import java.util.LinkedList;
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
public class EnhancedMofOperationImpl extends MofOperationImpl {

    
    public EnhancedMofOperationImpl() throws InstantiationException {
        Map plainMap = FactoryMethods.newMap(String.class, List.class);
        body = FactoryMethods.newList(Statement.class);
        plainMap.put("body", body);
    }



    public void buildBody() throws InstantiationException {
        System.out.println("Building body of " + this);
        body = FactoryMethods.newList(Statement.class);
        for (Precondition aCondition : getPreconditions()) {
            EnhancedPrecondition enhanced = (EnhancedPrecondition) aCondition;
            body.addAll(enhanced.getStatements());
        }
        List<EnhancedPostcondition> postconditions = (List)getPostconditions();
        Collections.sort(postconditions);
        for (EnhancedPostcondition aCondition : postconditions) {
            body.addAll(aCondition.getStatements());
        }
    }

    public List<Statement> getStatements() {
        return body;
    }


    public List<Statement> getBody() {
        return body;
    }




    private     List<Statement>                 body;


}

