package fr.insset.jeanluc.ete.meta.model.types.collections.impl;


import java.util.Objects;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofOrderedSet;

/**
 *
 * @author jldeleage
 */
public class MofOrderedSetImpl extends MofCollectionImpl implements MofOrderedSet {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MofOrderedSet)) {
            return false;
        }
        final MofOrderedSet other = (MofOrderedSet) obj;
        if (!Objects.equals(this.getBaseType(), other.getBaseType())) {
            return false;
        }
        return true;
    }

}
