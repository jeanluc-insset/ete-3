package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.AtPre;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.constraint.Precondition;
import fr.insset.jeanluc.ete.meta.model.emof.impl.MofOperationImpl;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.xlang.Allocation;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitor;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
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
public class EnhancedMofOperationImpl extends MofOperationImpl implements EnhancedMofOperation {

    
    public EnhancedMofOperationImpl() throws InstantiationException {
        statements = FactoryMethods.newList(Statement.class);
    }



//    @Override
//    public List<Statement> buildBody() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//        System.out.println("Building body of " + this);
//        localVariables = FactoryMethods.newMap(GelExpression.class, VariableDeclaration.class);
//        for (Precondition aCondition : getPreconditions()) {
//            EnhancedPrecondition enhanced = (EnhancedPrecondition) aCondition;
//            statements.addAll(enhanced.getStatements());
//        }
//        List<EnhancedPostcondition> postconditions = (List)getPostconditions();
//        Collections.sort(postconditions);
//        AtPreFinder atPreFinder = new AtPreFinder();
//        for (EnhancedPostcondition aCondition : postconditions) {
//            GelExpression expression = aCondition.getExpression();
//            atPreFinder.genericVisit(expression);
//        }
//        for (EnhancedPostcondition aCondition : postconditions) {
//            statements.addAll(aCondition.getStatements());
//        }
//        return statements;
//    }



    @Override
    public List<Statement> getBody() {
        return statements;
    }


    @Override
    public void setBody(List<Statement> inStatements) {
        statements = inStatements;
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


    private class AtPreFinder extends DynamicVisitorSupport {

        public Object visitAtPre(AtPre inAtPre, Object... parameters) throws InstantiationException, IllegalAccessException {
            VariableDeclaration declaration = (VariableDeclaration) FactoryRegistry.newInstance("variableDeclaration");
            MofType type = inAtPre.getType();
            declaration.setType(type);
            String  typeName = type.getName();
            declaration.setName(typeName + numLocalVar++);
            localVariables.put(inAtPre, declaration);
            statements.add(declaration);
            return inAtPre;
        }

        public Object visitAllocation(Allocation inAllocation, Object... parameters) throws InstantiationException, IllegalAccessException {
            VariableDeclaration declaration = (VariableDeclaration) FactoryRegistry.newInstance("variableDeclaration");
            MofType type = inAllocation.getType();
            declaration.setType(type);
            String  typeName = type.getName();
            declaration.setName(typeName + numLocalVar++);
            localVariables.put(inAllocation, declaration);
            statements.add(declaration);
            return inAllocation;
        }
    }       // class AtPreFinder



    //========================================================================//


    private     List<Statement>                         statements;
    private     Map<GelExpression, VariableDeclaration> localVariables;
    private     int                                     numLocalVar;


}

