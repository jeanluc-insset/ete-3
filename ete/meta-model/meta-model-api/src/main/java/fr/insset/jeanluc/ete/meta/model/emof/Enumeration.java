/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof;

import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public interface Enumeration extends Classifier {
    
    public final static String      MOF_ENUMERATION = "enumeration";


    public List<Literal>    getLiteral();
    public void             setLiteral(List<Literal> inLiterals);
    public void             addLiteral(Literal inLiteral);


}
