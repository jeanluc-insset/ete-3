/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.as.Assignment;
import fr.insset.jeanluc.ete.as.Statement;
import fr.insset.jeanluc.ete.as.VariableDeclaration;
import fr.insset.jeanluc.ete.as.impl.AssignmentImpl;
import fr.insset.jeanluc.ete.as.impl.VariableDeclarationImpl;
import fr.insset.jeanluc.ete.gel.impl.GelParserFactory;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.gel.*;
import fr.insset.jeanluc.gel.impl.VariableDefinitionImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jldeleage
 */
public class SimpleActionSemanticsBuilder extends DynamicVisitorSupport {


    public SimpleActionSemanticsBuilder() throws InstantiationException {
        register("visit", "fr.insset.jeanluc.gel");
        FactoryRegistry.getRegistry().registerDefaultFactory(Assignment.class, AssignmentImpl.class);
    }


    //========================================================================//


    public void buildStatements(GelExpression inExpression, List<Statement> inoutStatements) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        variables = new HashMap<>();
        genericVisit(inExpression, inoutStatements);
    }


    public Equal visitEqual(Equal inEqual, Object... inParameters) throws InstantiationException, IllegalAccessException {
        System.out.println("Visit of an equality");
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


    /**
     * 
     * @param inBinaryOperation
     * @param inParameters
     * @return 
     */
    public BinaryOperation visitBinaryOperation(BinaryOperation inBinaryOperation, Object... inParameters) {
        return inBinaryOperation;
    }



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
