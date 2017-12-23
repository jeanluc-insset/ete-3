/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof.impl;

import fr.insset.jeanluc.ete.meta.model.core.impl.Factories;
import fr.insset.jeanluc.ete.meta.model.emof.Enumeration;
import fr.insset.jeanluc.ete.meta.model.emof.Literal;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class EnumerationImpl extends ClassifierImpl implements Enumeration {

    public EnumerationImpl() throws InstantiationException {
    }

    @Override
    public List<Literal> getLiteral() {
        return literal;
    }

    @Override
    public void setLiteral(List<Literal> inLiterals) {
        literal = inLiterals;
    }

    @Override
    public void addLiteral(Literal inLiteral) {
        literal.add(inLiteral);
    }
    
    private     List<Literal>       literal;

    {
        try {
            literal = FactoryMethods.newList(Literal.class);
        } catch (InstantiationException ex) {
            Logger.getLogger(EnumerationImpl.class.getName()).log(Level.SEVERE, "Cannot create the literal list", ex);
        }
    }

}
