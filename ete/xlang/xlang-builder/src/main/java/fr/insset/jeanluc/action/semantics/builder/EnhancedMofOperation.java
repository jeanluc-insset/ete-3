/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.emof.MofOperation;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jldeleage
 */
public interface EnhancedMofOperation extends MofOperation {

//    public List<Statement> buildBody() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException;

    public List<Statement> getBody();
    public void            setBody(List<Statement> inStatements);
    
    public Map<GelExpression, VariableDeclaration> getLocalVariables();

}
