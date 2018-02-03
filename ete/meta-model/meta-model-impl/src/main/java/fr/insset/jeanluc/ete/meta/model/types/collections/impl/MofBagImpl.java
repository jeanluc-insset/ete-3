package fr.insset.jeanluc.ete.meta.model.types.collections.impl;

import java.util.Objects;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofBag;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.util.factory.FactoryRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class MofBagImpl extends MofCollectionImpl implements MofBag {

    public String   getSymbol() {
        return MOF_BAG;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MofBag)) {
            return false;
        }
        final MofBag other = (MofBag) obj;
        if (!Objects.equals(this.getBaseType(), other.getBaseType())) {
            return false;
        }
        return true;
    }



}
