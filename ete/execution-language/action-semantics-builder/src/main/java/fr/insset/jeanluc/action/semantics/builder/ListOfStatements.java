/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.as.Statement;
import fr.insset.jeanluc.gel.VariableDefinition;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class ListOfStatements implements Comparable<ListOfStatements> {


    public ListOfStatements() throws InstantiationException {
        this(FactoryMethods.newList(Statement.class));
    }

    public ListOfStatements(List<Statement> inList) {
        statements = inList;
    }


    //========================================================================//


    @Override
    public int compareTo(ListOfStatements inOther) {
        if (dependances == null) {
            // compute dependances
        }
        return 0;
    }


    //========================================================================//


    public void addStatement(Statement inStatement) {
        statements.add(inStatement);
    }


    //========================================================================//


    List<Statement>                 statements;
    VariableDefinition              targetVariable;
    Collection<VariableDefinition>  dependances;


}
