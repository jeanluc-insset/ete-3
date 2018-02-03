package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.Equal;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Assignment;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.impl.AssignmentImpl;
import fr.insset.jeanluc.ete.xlang.impl.VariableDeclarationImpl;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class SimpleActionSemanticsBuilder extends DynamicVisitorSupport {


    public SimpleActionSemanticsBuilder() throws InstantiationException {
        register("visit", "fr.insset.jeanluc.ete.gel");
        FactoryRegistry.getRegistry().registerDefaultFactory(Assignment.class, AssignmentImpl.class);
    }


    //========================================================================//


    public void buildStatements(GelExpression inExpression, List<Statement> inoutStatements) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        variables = new HashMap<>();
        // if the expression is an equality we must build an affectation
//        if (inExpression instanceof Equal) {
//            
//        }
//        else {
            genericVisit(inExpression, inoutStatements);
//        }
    }


    public Equal visitEqual(Equal inEqual, Object... inParameters) throws InstantiationException, IllegalAccessException {
        Logger      logger = Logger.getGlobal();
        logger.log(Level.FINE, "Visit of an equality");
        Assignment assignment = (Assignment) FactoryRegistry.newInstance(Assignment.class);
        List<GelExpression> operands = inEqual.getOperand();
        GelExpression leftValue = operands.get(0);
        GelExpression rightValue = operands.get(1);
        assignment.setLeftValue(leftValue);
        assignment.setValue(rightValue);
        List<Statement> statements = (List<Statement>) inParameters[0];
        statements.add(assignment);
        return inEqual;
    }


    //========================================================================//



    protected void buildTemporalGraph() {
        
    }



    //========================================================================//





    //========================================================================//


    protected final void addVariable(String inName, MofType inType) {
        VariableDeclaration variable = new VariableDeclarationImpl();
        variable.setIdentifier(inName);
        VariableDefinition definition = new VariableDefinitionImpl();
        definition.setIdentifier(inName);
        definition.setType(inType);
        variable.setDefinitionExpression(definition);
        variables.put(inName, variable);
    }



    //========================================================================//


    private     Map<String, VariableDeclaration>    variables;


}
