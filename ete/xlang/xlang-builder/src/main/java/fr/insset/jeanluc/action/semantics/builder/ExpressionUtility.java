

package fr.insset.jeanluc.action.semantics.builder;



import fr.insset.jeanluc.ete.gel.GelExpression;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author jldeleage
 */
public class ExpressionUtility {

    public static boolean areEqual(GelExpression e1, GelExpression e2) {
        Class<? extends GelExpression> class1 = e1.getClass();
        Class<? extends GelExpression> class2 = e2.getClass();
        if (! class1.equals(class2)) {
            return false;
        }
        List<GelExpression> operands1 = e1.getOperand();
        List<GelExpression> operands2 = e2.getOperand();
        if (operands1 == null) {
            return operands2 == null;
        }
        if (operands2 == null) {
            return false;
        }
        try {
            DoubleIterator<GelExpression, GelExpression> it = new DoubleIterator<>(operands1, operands2);
            while (it.hasNext()) {
                Couple<GelExpression, GelExpression> next = it.next();
                return areEqual(next.getT1(), next.getT2());
            }
        }
        catch (Exception ex) {
            // the two lists have not the same size.
            return false;
        }
        return true;
    }


    public static class Couple<T, U> {

        public Couple(T t, U u) {
            this.t = t;
            this.u = u;
        }

        public T getT1() {
            return t;
        }

        public U getT2() {
            return u;
        }

        private     T   t;
        private     U   u;

    }


    public static class DoubleIterator<T, U> implements Iterator<Couple<T,U>> {

        public DoubleIterator(Iterable<T> first, Iterable<U> second) {
            
        }

        @Override
        public boolean hasNext() {
            return first.hasNext() || second.hasNext();
        }

        @Override
        public Couple<T,U> next() {
            return new Couple<T,U>(first.next(), second.next());
        }
        
        Iterator<T>     first;
        Iterator<U>     second;

    }       // DoubleIterator

}       // ExpressionUtility
