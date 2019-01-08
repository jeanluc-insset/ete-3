/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

/**
 * Stores every piece of information in order to build SQL joins or Java
 * navigation and so on.
 *
 * @author jldeleage
 */
    public class Join {

    public Join(int srcAliasNumber, int targetAliasNumber, String targetTableName, String propName, boolean reverseNumbers) {
        this.srcAliasNumber = srcAliasNumber;
        this.targetAliasNumber = targetAliasNumber;
        this.targetTableName = targetTableName;
        this.propName = propName;
        this.reverseNumbers = reverseNumbers;
    }

    public int getSrcAliasNumber() {
        return srcAliasNumber;
    }

    public int getTargetAliasNumber() {
        return targetAliasNumber;
    }

    public String getTargetTableName() {
        return targetTableName;
    }

    public String getPropName() {
        return propName;
    }

    public boolean isReverseNumbers() {
        return reverseNumbers;
    }






    private     int     srcAliasNumber, targetAliasNumber;
    private     String  targetTableName;
    private     String  propName;
    /**
     * In an n-1 relationship, the join links a foreign key of the src table to
     * the primary key of the target table.<br>
     * In the case of a 1-n relationship we set this property to true.
     */
    private     boolean reverseNumbers;

}
