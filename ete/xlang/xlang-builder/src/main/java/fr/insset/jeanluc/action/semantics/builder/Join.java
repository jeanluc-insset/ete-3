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

    public Join() {
    }


    /**
     * <div>
     * An instance of this class is intented to make the generation of SQL
     * queries with complex navigations easy.<br>
     * Typically, an instance gives the following clause&nbsp;<pre><code>
     * LEFT OUTER JOIN &lt;targetTableName&gt; AS &lt;targetAliasName&gt;
     *     ON &lt;targetAliasName&gt;.&lt;propName&gt; = v&lt;srcAliasNumber&gt;.ID
     * </code></pre>
     * </div>
     */
    public Join(Feature targetFeature, String targetVariableName, String srcVariableNameAndField, boolean reverseNames) {
        this.targetFeature = targetFeature;
        this.targetVariableName = targetVariableName;
        this.srcVariableNameAndField = srcVariableNameAndField;
        this.reverseNames = reverseNames;
    }

    public Feature getTargetFeature() {
        return targetFeature;
    }

    public void setTargetFeature(Feature targetFeature) {
        this.targetFeature = targetFeature;
    }

    public String getTargetVariableName() {
        return targetVariableName;
    }

    public void setTargetVariableName(String targetVariableName) {
        this.targetVariableName = targetVariableName;
    }

    public String getSrcVariableNameAndField() {
        return srcVariableNameAndField;
    }

    public void setSrcVariableNameAndField(String srcVariableNameAndField) {
        this.srcVariableNameAndField = srcVariableNameAndField;
    }

    public boolean isReverseNames() {
        return reverseNames;
    }

    public void setReverseNames(boolean reverseNames) {
        this.reverseNames = reverseNames;
    }



    private Feature     targetFeature;
    private String      targetVariableName;
    private String      srcVariableNameAndField;
    /** If false, the join is "ManyToOne"
     * otherwise it is "OneToMany"
     */
    private boolean     reverseNames;



}
