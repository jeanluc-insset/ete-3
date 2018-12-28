package fr.insset.jeanluc.action.semantics.builder;



import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.ete.gel.impl.IntegerLiteralImpl;
import fr.insset.jeanluc.ete.meta.model.constraint.Invariant;
import fr.insset.jeanluc.ete.meta.model.emof.MofClass;
import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import fr.insset.jeanluc.ete.xlang.VariableDeclaration;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A EteFilter aims to be translated to filter expressions in a stream, an
 Observable or to "where" statements in an SQL query.<br>
 * For example, the invariant <code>captain &lt;&gt; copilot</code> gives two
 * filters&nbsp;:<ul>
 * <li>
 *      <ul>
 *          <li>filtered class : Pilot</li>
 *          <li>client class : Flight</li>
 *          <li>filtered property : captain</li>
 *          <li>invariant : crew</li>
 *          <li>gelExpression : captain &lt;&gt; copilot</li>
 *      </ul>
 *      <ul>
 *          <li>filtered class : Pilot</li>
 *          <li>client class : Flight</li>
 *          <li>filtered property : copilot</li>
 *          <li>invariant : crew</li>
 *          <li>gelExpression : captain &lt;&gt; copilot</li>
 *      </ul>
 * </li>
 * </ul>
 * The first instance will hold the additional information :<ul>
 * <li></li>
 * </ul>
 * With all this information, the JPA Generator will generate for that instance :<br>
 * <code><pre>public CriteriaQuery&lt;Pilot&gt; filterCaptainForCrew(Flight inFlight, CriteriaQuery inQuery) {
 *    
 *    return inQuery;
 * }
 * </pre></code>
 *
 * @author jldeleage
 */
public class EteFilter {

    public MofClass getClientClass() {
        return clientClass;
    }

    public void setClientClass(MofClass clientClass) {
        this.clientClass = clientClass;
    }

    public MofProperty getFilteredProperty() {
        return filteredProperty;
    }

    public void setFilteredProperty(MofProperty filteredProperty) {
        this.filteredProperty = filteredProperty;
    }

    public Invariant getInvariant() {
        return invariant;
    }

    public void setInvariant(Invariant invariant) {
        this.invariant = invariant;
    }

    public GelExpression getExpression() {
        return expression;
    }

    public void setExpression(GelExpression expression) {
        this.expression = expression;
    }

    public GelExpression getVariableValue(String inVariable) {
        final String    QUARANTE_DEUX = "42";
        Logger.getGlobal().log(Level.FINE, "getVariableValue for {0}", inVariable);
        IntegerLiteralImpl result = new IntegerLiteralImpl();
        result.setValueAsString(QUARANTE_DEUX);
        return result;
    }




    public List<VariableDeclaration> getVariables() {
        return variables;
    }

    public void setVariables(List<VariableDeclaration> variables) {
        this.variables = variables;
    }




    public void addVariable(VariableDeclaration inValue) {
        this.variables.add(inValue);
    }



    public String getPropertyName() {
        return getFilteredProperty().getName();
    }

//    public void setPropertyName(String propertyName) {
//        this.propertyName = propertyName;
//    }

    public VariableDeclaration getTargetVariable() {
        return targetVariable;
    }

    public void setTargetVariable(VariableDeclaration targetVariable) {
        this.targetVariable = targetVariable;
    }



    //========================================================================//


    private     MofClass                    clientClass;
    private     MofProperty                 filteredProperty;
    private     VariableDeclaration         targetVariable;
    private     Invariant                   invariant;
    private     GelExpression               expression;
//    private     String                      propertyName;
    private     List<VariableDeclaration>   variables = new LinkedList<>();


}
