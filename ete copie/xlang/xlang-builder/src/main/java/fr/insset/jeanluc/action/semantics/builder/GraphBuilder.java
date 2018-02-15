package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.And;
import fr.insset.jeanluc.ete.gel.AtPre;
import fr.insset.jeanluc.ete.gel.Equal;
import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.Nav;
import fr.insset.jeanluc.ete.gel.Operation;
import fr.insset.jeanluc.ete.gel.Step;
import fr.insset.jeanluc.ete.meta.model.constraint.Postcondition;
import fr.insset.jeanluc.ete.meta.model.emof.Feature;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.types.MofType;
import fr.insset.jeanluc.ete.meta.model.types.collections.MofCollection;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 * <div>
 * Builds th"temporal" and the "dependance"  graphs.
 * </div>
 * <div>
 * <b>Temporal graph</b><br>
 * Suppose we have a postcondition such that&nbsp;:<br>
 *  <code>a = b@pre and b=a@pre</code><br>
 * We must create an auxiliary variable in order to create the
 * statements&nbsp;:<br>
 * <code><pre>var aux : typeA
 * aux = a
 * a  = b
 * b = aux
 * </pre></code>
 * The problem occurs when we have a cycle in the <quote>temporal
 * graph</quote>. There is an edge is this graph from x to y if there
 * is an equality in the assertion of the form
 * <code>y = f(x@pre)</code>.<br>
 * A simple solution would be to store any expression marked @pre in a
 * fresh local variable, but it would less elegant.
 * </div>
 * <div>
 * <b>Dependance graph</b>
 * The dependance graph keeps track of every occurrence of a variable/property x
 * in a condition of the form <code>y = f(x)</code><br>
 * This graph should not contain any cycle and gives a precedence for the
 * instructions.<br>
 * At the then of the method, postconditions are sorted following the order
 * defined by that graph.
 * </div>
 *
 * @author jldeleage
 */
public class GraphBuilder extends DynamicVisitorSupport {



    public GraphBuilder() {
        register("visit", "fr.insset.jeanluc.gel");
    }



    //========================================================================//


    public void buildGraphs(fr.insset.jeanluc.ete.meta.model.emof.MofOperation inOperation) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<Postcondition> conditions = inOperation.getPostconditions();
        for (Postcondition aCondition : conditions) {
            genericVisit(aCondition);
        }
    }


    //========================================================================//


    public Operation visitOperation(Operation inOperation, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (GelExpression anOperand : inOperation.getOperand()) {
            genericVisit(anOperand, inParameters);
        }
        return inOperation;
    }


    //========================================================================//


    public Postcondition    visitPostcondition(Postcondition inCondition, Object... inParameters) {
        StatementContainer container = (StatementContainer) inCondition.getSpecification();
        GelExpression abstractTree = container.getAbstractTree();
        handleTopAssertion(abstractTree);
        return inCondition;
    }


    /**
     * Breaks recursively a "top level logical conjunction expression" into its
     * components.<br>
     * So a user can write a postcondition like&nbsp;:<br>
     * <code>x = y@pre and y=x@pre</code><br>
     * This will lead to the analysis of both parts of the assertion as if they
     * were written in two separate postcondition.
     * 
     */
    protected void handleTopAssertion(GelExpression inExpression) {
        if (inExpression instanceof And) {
            And and = (And) inExpression;
            for (GelExpression subexpression : and.getOperand()) {
                handleTopAssertion(subexpression);
            }
        }
        else if (inExpression instanceof Equal) {
            Equal equal = (Equal) inExpression;
            handleBasicAssertion(equal);
        }
    }


    /**
     * Handles an expression of the form <code>x&nbsp;=&nbsp;f(x,y)</code>
     * 
     * @param inExpression 
     */
    protected void handleBasicAssertion(Equal inEqual) {
        List<GelExpression> operand = inEqual.getOperand();
        GelExpression left = operand.get(0);
        Logger.getLogger("fr.insset.jeanluc.oclanalyzer.ReaderVisitor").log(Level.FINE, "Left member : " + left + " class : " + left.getClass());
    }

    //========================================================================//



    public AtPre visitAtPre(AtPre inAtPre, Object... inParameters) {
        Step navigation = (Step) inAtPre.getOperand();
        navigation.getToFeature();
        return inAtPre;
    }


    //========================================================================//



    public Graph getTemporalGraph() {
        return temporalGraph;
    }

    public Graph getDependanceGraph() {
        return dependanceGraph;
    }


    //========================================================================//


    Graph       temporalGraph   = new Graph();
    Graph       dependanceGraph = new Graph();

}

