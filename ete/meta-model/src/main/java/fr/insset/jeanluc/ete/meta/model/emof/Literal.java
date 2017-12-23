/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof;

/**
 *
 * @author jldeleage
 */
public interface Literal {
    
    public final    String      LITERAL = "literal";

    public Object   getValue();
    public void     setValue(Object inValue);

}
