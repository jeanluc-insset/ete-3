/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.as.Statement;
import fr.insset.jeanluc.gel.GelExpression;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class StatementContainer {





    public GelExpression getAbstractTree() {
        return abstractTree;
    }

    public void setAbstractTree(GelExpression abstractTree) {
        this.abstractTree = abstractTree;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
    

    private     GelExpression   abstractTree;
    private     List<Statement> statements;

}
