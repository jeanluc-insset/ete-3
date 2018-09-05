

package fr.insset.jeanluc.actual.xlang_builder;

import static fr.insset.jeanluc.ete.defs.Constants.NOT_IMPLEMENTED_YET;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import fr.insset.jeanluc.ete.xlang.builder.impl.EnhancedOperationImpl;
import fr.insset.jeanluc.ete.xlang.builder.impl.EnhancedPostconditionImpl;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jldeleage
 */
public class ActualEnhancedOperationImpl extends EnhancedOperationImpl {

    public ActualEnhancedOperationImpl() throws InstantiationException {
        this.localVariables = FactoryMethods.newMap(GelExpression.class, VariableDeclaration.class);
    }




    @Override
    public void buildStatements() {
        try {
            List<Postcondition> postconditions = getPostconditions();
            List<EnhancedPostconditionImpl> enhancedConditions = FactoryMethods.newList(EnhancedPostconditionImpl.class);
            enhancedConditions.sort(new PostconditionComparator());
            lookForCyclicDependancies(enhancedConditions);
            for (EnhancedPostconditionImpl aPostcondition : enhancedConditions ) {
                
            }
        } catch (InstantiationException ex) {
            Logger.getLogger(ActualEnhancedOperationImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Unable to create an instance : ", ex);
        }
    }


    /**
     * This method adds statements to break cyclic dependancies
     * 
     */
    protected void lookForCyclicDependancies(List<EnhancedPostconditionImpl> enhancedCOnditions) {
        
    }   // lookForCyclicDependancies



    private class PostconditionComparator implements Comparator<EnhancedPostconditionImpl> {

        @Override
        public int compare(EnhancedPostconditionImpl o1, EnhancedPostconditionImpl o2) {
            throw new UnsupportedOperationException(NOT_IMPLEMENTED_YET); //To change body of generated methods, choose Tools | Templates.
        }
    }           // class PostconditionComparator


    private     Map<GelExpression, VariableDeclaration>    localVariables;


}       // ActualEnhancedOperationImpl
