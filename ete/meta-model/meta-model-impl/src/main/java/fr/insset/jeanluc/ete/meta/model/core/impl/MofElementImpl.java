package fr.insset.jeanluc.ete.meta.model.core.impl;

import fr.insset.jeanluc.ete.meta.model.core.MofElement;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author jldeleage
 */
public class MofElementImpl implements MofElement {

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String inId) {
        id = inId;
    }

    @Override
    public void addDependance(MofElement inDependance) {
        if (dependances == null) {
            dependances = new HashSet<>();
        }
        dependances.add(inDependance);
    }

    @Override
    public void removeDependance(MofElement inDependance) {
        if (dependances == null) {
            return;
        }
        dependances.remove(inDependance);
    }

    @Override
    public Set<MofElement> getDependance() {
        if (dependances == null) {
            return Collections.EMPTY_SET;
        }
        return dependances;
    }


    private String      id;
    private Set<MofElement>     dependances;

}
