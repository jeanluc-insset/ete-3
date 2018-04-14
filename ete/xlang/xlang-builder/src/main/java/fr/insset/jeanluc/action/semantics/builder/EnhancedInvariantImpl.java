

package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.constraint.impl.InvariantImpl;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class EnhancedInvariantImpl extends InvariantImpl implements Invariant {




    private     List<MofProperty>      support = new LinkedList<>();

}
