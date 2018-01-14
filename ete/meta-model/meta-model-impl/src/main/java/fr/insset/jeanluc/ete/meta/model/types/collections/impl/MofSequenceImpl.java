package fr.insset.jeanluc.ete.meta.model.types.collections.impl;


import java.util.Objects;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofSequence;

/**
 *
 * @author jldeleage
 */
public class MofSequenceImpl extends MofCollectionImpl implements MofSequence {

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MofSequence)) {
            return false;
        }
        final MofSequence other = (MofSequence) obj;
        if (!Objects.equals(this.getBaseType(), other.getBaseType())) {
            return false;
        }
        return true;
    }

    @Override
    public String getName() {
        return "Sequence<" + getBaseType().getName() + ">";
    }

    @Override
    public String getQualifiedName() {
        return "Sequence<" + getBaseType().getQualifiedName() + ">";
    }

    @Override
    public boolean isOrdered() {
        return true;
    }

    @Override
    public boolean isDistinct() {
        return true;
    }



}
