/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.types.MofType;

/**
 * Stores every piece of information in order to build SQL joins or Java
 * navigation and so on.
 *
 * @author jldeleage
 */
public class Join {


    public Join(String startVariable, String startProperty, String targetVariable, String targetTable, String targetProperty) {
        this.startVariable = startVariable;
        this.startProperty = startProperty;
        this.targetVariable = targetVariable;
        this.targetTable = targetTable;
        this.targetProperty = targetProperty;
        System.out.println("    Creating a join : "
                + startVariable
                + "." + startProperty
                + "=" + targetTable
                + " (AS " + targetVariable + ")." + targetProperty);
    }



    public String getStartVariable() {
        return startVariable;
    }

    public void setStartVariable(String startVariable) {
        this.startVariable = startVariable;
    }

    public String getStartProperty() {
        return startProperty;
    }

    public void setStartProperty(String startProperty) {
        this.startProperty = startProperty;
    }

    public String getTargetVariable() {
        return targetVariable;
    }

    public void setTargetVariable(String targetVariable) {
        this.targetVariable = targetVariable;
    }

    public String getTargetTable() {
        return targetTable;
    }

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    public String getTargetProperty() {
        return targetProperty;
    }

    public void setTargetProperty(String targetProperty) {
        this.targetProperty = targetProperty;
    }



    private String      startVariable;
    private String      startProperty;
    private String      targetVariable;
    private String      targetTable;
    private String      targetProperty;

}
