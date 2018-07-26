

package fr.insset.jeanluc.gel.test.fmwk;

import fr.insset.jeanluc.ete.gel.GelExpression;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class ExpressionPrinter {


    public void print(GelExpression inExpression) {
        print(inExpression, new PrintWriter(new OutputStreamWriter(System.out)));
    }

    public void print(GelExpression inExpression, String inIndentation) {
        print(inExpression, new PrintWriter(new OutputStreamWriter(System.out)), inIndentation);
    }


    public void print(GelExpression inExpression, PrintWriter   out) {
        print(inExpression, out, "    ");
    }


    public void print(GelExpression inExpression, PrintWriter   out, String inIndentation) {
        out.print(inIndentation);
        out.print('[');
        out.print(inExpression.getName());
        out.print("] : ");
        out.println(inExpression.getClass().getName());
        inIndentation += indentation;
        List<GelExpression> operand = inExpression.getOperand();
        if (operand == null) {
            return;
        }
        for (GelExpression anExpression : operand) {
            print(anExpression, out, inIndentation);
        }
    }

    public void setIndentation(String indentation) {
        this.indentation = indentation;
    }

    private String      indentation = "    ";
}
