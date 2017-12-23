/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof.impl;

import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.types.Classifier;
import fr.insset.jeanluc.ete.meta.model.types.impl.TypedElementImpl;

/**
 *
 * @author jldeleage
 */
public class FeatureImpl extends TypedElementImpl implements Feature {

    @Override
    public Classifier getOwningMofClass() {
        return classifier;
    }

    @Override
    public void setOwningMofClass(Classifier inMofClass) {
        classifier = inMofClass;
    }



    private     Classifier        classifier;

}
