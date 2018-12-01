package fr.insset.jeanluc.ete.meta.model.core;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 *
 * @author jldeleage
 */
public interface MofElement {

    public String                       getId();
    public void                         setId(String inId);

    public  void                        addDependency(MofElement inDependance);
    public  void                        removeDependency(MofElement inDependance);
    public  Set<MofElement>             getDependency();
    public  default Stream<MofElement>  getDependencyAsStream() {
        return getDependency().stream();
    }
    public  default Set<MofElement>     getAllDependencies() {
        return getDependency();
    }
    public default Stream<MofElement>   getAllDependenciesAsStream() {
        return getAllDependencies().stream();
    }


}
