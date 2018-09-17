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

    public  void                        addDependance(MofElement inDependance);
    public  void                        removeDependance(MofElement inDependance);
    public  Set<MofElement>             getDependance();
    public  default Stream<MofElement>  getDependanceAsStream() {
        return getDependance().stream();
    }
    public  default Set<MofElement>     getAllDependances() {
        return getDependance();
    }
    public default Stream<MofElement>   getAllDependancesAsStream() {
        return getAllDependances().stream();
    }


}
