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
    public void addDependency(MofElement inDependance) {
        if (dependencies == null) {
            dependencies = new HashSet<>();
        }
        dependencies.add(inDependance);
    }

    @Override
    public void removeDependency(MofElement inDependance) {
        if (dependencies == null) {
            return;
        }
        dependencies.remove(inDependance);
    }

    @Override
    public Set<MofElement> getDependency() {
        if (dependencies == null) {
            return Collections.EMPTY_SET;
        }
        return dependencies;
    }


    private String      id;
    private Set<MofElement>     dependencies;

}
