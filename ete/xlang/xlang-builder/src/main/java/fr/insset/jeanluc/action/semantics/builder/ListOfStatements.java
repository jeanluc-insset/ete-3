package fr.insset.jeanluc.action.semantics.builder;


import fr.insset.jeanluc.ete.gel.VariableDefinition;
import fr.insset.jeanluc.ete.xlang.Statement;
import fr.insset.jeanluc.util.factory.FactoryMethods;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Lists of statements contain statements and are comparable to each other.<br>
 * The purpose is to generate parts of methods from constraints. Each constraint
 * is translated to a list of statements.<br>
 * The preconditions must be executed before other conditions and a "result"
 * postcondition must be executed finally.<br>
 * So the lists of statements are sorted before generating actual ALF code.
 *
 * @author jldeleage
 */
public class ListOfStatements implements Comparable<ListOfStatements>, List<Statement> {


    public ListOfStatements() throws InstantiationException {
        this(FactoryMethods.newList(Statement.class));
    }

    public ListOfStatements(List<Statement> inList) {
        statements = inList;
    }


    /**
     * The new instance contains a 
     */
    public ListOfStatements(ListOfStatements... inLists) {
        Arrays.sort(inLists, (l1, l2) -> l1.compareTo(l2));
        for (ListOfStatements aList : inLists) {
            statements.addAll(aList.statements);
        }
    }


    //========================================================================//


    @Override
    public int compareTo(ListOfStatements inOther) {
        if (isPrecondition) return -1;
        if (inOther.isPrecondition) return 1;
        if (isResult) return 1;
        if (inOther.isResult) return 1;
        return 0;
    }


    //========================================================================//


    public void addStatement(Statement inStatement) {
        statements.add(inStatement);
    }


    //========================================================================//

    @Override
    public int size() {
        return statements.size();
    }

    @Override
    public boolean isEmpty() {
        return statements.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return statements.contains(o);
    }

    @Override
    public Iterator<Statement> iterator() {
        return statements.iterator();
    }

    @Override
    public Object[] toArray() {
        return statements.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return statements.toArray(a);
    }

    @Override
    public boolean add(Statement e) {
        return statements.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return statements.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return statements.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Statement> c) {
        return statements.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Statement> c) {
        return statements.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return statements.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return statements.retainAll(c);
    }

    @Override
    public void replaceAll(UnaryOperator<Statement> operator) {
        statements.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Statement> c) {
        statements.sort(c);
    }

    @Override
    public void clear() {
        statements.clear();
    }

    @Override
    public boolean equals(Object o) {
        return statements.equals(o);
    }

    @Override
    public int hashCode() {
        return statements.hashCode();
    }

    @Override
    public Statement get(int index) {
        return statements.get(index);
    }

    @Override
    public Statement set(int index, Statement element) {
        return statements.set(index, element);
    }

    @Override
    public void add(int index, Statement element) {
        statements.add(index, element);
    }

    @Override
    public Statement remove(int index) {
        return statements.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return statements.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return statements.lastIndexOf(o);
    }

    @Override
    public ListIterator<Statement> listIterator() {
        return statements.listIterator();
    }

    @Override
    public ListIterator<Statement> listIterator(int index) {
        return statements.listIterator(index);
    }

    @Override
    public List<Statement> subList(int fromIndex, int toIndex) {
        return statements.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<Statement> spliterator() {
        return statements.spliterator();
    }

    @Override
    public boolean removeIf(Predicate<? super Statement> filter) {
        return statements.removeIf(filter);
    }

    @Override
    public Stream<Statement> stream() {
        return statements.stream();
    }

    @Override
    public Stream<Statement> parallelStream() {
        return statements.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super Statement> action) {
        statements.forEach(action);
    }







    //========================================================================//


    List<Statement>                 statements;
    VariableDefinition              targetVariable;
    Collection<VariableDefinition>  dependances;
    boolean                         isResult;
    boolean                         isPrecondition;


}
