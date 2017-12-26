package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.meta.model.constraint.Constraint;
import fr.insset.jeanluc.gel.VariableDefinition;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class Graph {


    public void addEdge(VariableDefinition inFrom, VariableDefinition inTo, Constraint inCondition) {
        Edge edge = new Edge(inFrom, inTo, inCondition);
        edges.add(edge);
    }


    public List<Graph>  lookforCycles() {
        List<Graph> result = new LinkedList<>();
        
        return result;
    }


    //========================================================================//


    /**
     * An edge from A to B in condition C means that the condition C defines
     * A and uses B so A depends on B. In other words, C is a constraint of
     * the form <code>A&nbsp;=&nbsp;f(B)</code>
     */
    public class Edge {

        public Edge(VariableDefinition from, VariableDefinition to, Constraint condition) {
            this.from = from;
            this.to = to;
            this.condition = condition;
        }

        private VariableDefinition      from;
        private VariableDefinition      to;
        private Constraint              condition;

    }       // Edge


    //========================================================================//


    private     List<Edge>              edges = new LinkedList<>();


}       // Graph
