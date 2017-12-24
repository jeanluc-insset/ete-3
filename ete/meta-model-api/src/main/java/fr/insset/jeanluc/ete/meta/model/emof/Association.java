/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.ete.meta.model.emof;

import fr.insset.jeanluc.ete.meta.model.mofpackage.PackageableElement;
import java.util.Collection;

/**
 *
 * @author jldeleage
 */
public interface Association extends PackageableElement {

    public  final static String         ASSOCIATION  = "association";

    public  Collection<MofProperty>        getMemberEnd();
    public  void                        addMemberEnd(MofProperty inProperty);
    public  void                        removeMemberEnd(MofProperty inProperty);

    public  Collection<MofProperty>        getOwnedEnd();
    public  void                        addOwnedEnd(MofProperty inProperty);
    public  void                        removeOwnedEnd(MofProperty inProperty);

}
