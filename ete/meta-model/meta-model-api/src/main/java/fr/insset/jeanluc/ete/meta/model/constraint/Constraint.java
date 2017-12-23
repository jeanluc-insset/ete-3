/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.constraint;

import fr.insset.jeanluc.ete.meta.model.core.NamedElement;

/**
 *
 * @author jldeleage
 */
public interface Constraint extends NamedElement {

    public final static String  CONSTRAINT = "constraint";

    public  NamedElement        getContext();
    public  void                setContext(NamedElement inContext);

    public  String              getSpecificationAsString();
    public  void                setSpecificationAsString(String inSpecification);

    public  Object              getSpecification();
    public  void                setSpecification(Object inSpecification);
}
