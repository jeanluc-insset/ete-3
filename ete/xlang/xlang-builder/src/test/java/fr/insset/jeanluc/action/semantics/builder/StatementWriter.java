/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.gel.GelExpression;
import fr.insset.jeanluc.util.visit.DynamicVisitorSupport;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * The append method of this helper class adds String representation of
 * a statement to its StringBuilder.
 *
 * @author jldeleage
 */
public class StatementWriter extends DynamicVisitorSupport {



    public StatementWriter() {
        register("visit", "fr.insset.jeanluc.ete.gel");
    }



    //==========================================================================//

    public String toString() {
        return builder.toString();
    }

    public StringBuilder append(Object obj) {
        return builder.append(obj);
    }

    public StringBuilder append(String str) {
        return builder.append(str);
    }

    public StringBuilder append(StringBuffer sb) {
        return builder.append(sb);
    }

    public StringBuilder append(CharSequence s) {
        return builder.append(s);
    }

    public StringBuilder append(CharSequence s, int start, int end) {
        return builder.append(s, start, end);
    }

    public StringBuilder append(char[] str) {
        return builder.append(str);
    }

    public StringBuilder append(char[] str, int offset, int len) {
        return builder.append(str, offset, len);
    }

    public StringBuilder append(boolean b) {
        return builder.append(b);
    }

    public StringBuilder append(char c) {
        return builder.append(c);
    }

    public StringBuilder append(int i) {
        return builder.append(i);
    }

    public StringBuilder append(long lng) {
        return builder.append(lng);
    }

    public StringBuilder append(float f) {
        return builder.append(f);
    }

    public StringBuilder append(double d) {
        return builder.append(d);
    }

    public StringBuilder appendCodePoint(int codePoint) {
        return builder.appendCodePoint(codePoint);
    }

    public StringBuilder delete(int start, int end) {
        return builder.delete(start, end);
    }

    public StringBuilder deleteCharAt(int index) {
        return builder.deleteCharAt(index);
    }

    public StringBuilder replace(int start, int end, String str) {
        return builder.replace(start, end, str);
    }

    public StringBuilder insert(int index, char[] str, int offset, int len) {
        return builder.insert(index, str, offset, len);
    }

    public StringBuilder insert(int offset, Object obj) {
        return builder.insert(offset, obj);
    }

    public StringBuilder insert(int offset, String str) {
        return builder.insert(offset, str);
    }

    public StringBuilder insert(int offset, char[] str) {
        return builder.insert(offset, str);
    }

    public StringBuilder insert(int dstOffset, CharSequence s) {
        return builder.insert(dstOffset, s);
    }

    public StringBuilder insert(int dstOffset, CharSequence s, int start, int end) {
        return builder.insert(dstOffset, s, start, end);
    }

    public StringBuilder insert(int offset, boolean b) {
        return builder.insert(offset, b);
    }

    public StringBuilder insert(int offset, char c) {
        return builder.insert(offset, c);
    }

    public StringBuilder insert(int offset, int i) {
        return builder.insert(offset, i);
    }

    public StringBuilder insert(int offset, long l) {
        return builder.insert(offset, l);
    }

    public StringBuilder insert(int offset, float f) {
        return builder.insert(offset, f);
    }

    public StringBuilder insert(int offset, double d) {
        return builder.insert(offset, d);
    }

    public int indexOf(String str) {
        return builder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return builder.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return builder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return builder.lastIndexOf(str, fromIndex);
    }

    public StringBuilder reverse() {
        return builder.reverse();
    }



    //==========================================================================//


    public StatementWriter  append(GelExpression inExpression) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        genericVisit(inExpression);
        return this;
    }


    public GelExpression visitGelExpression(GelExpression inExpression, Object... inParameters) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        List<GelExpression> operand = inExpression.getOperand();
        if (operand == null) {
            return inExpression;
        }
        switch (operand.size()) {
            case 0:
                return inExpression;
            case 1:
                builder.append(inExpression.getName());
                genericVisit(operand.get(0));
                break;
            case 2:
                genericVisit(operand.get(0));
                builder.append(inExpression.getName());
                genericVisit(operand.get(1));
                break;
            default:
                builder.append(inExpression.getName());
                for (GelExpression op : operand) {
                    genericVisit(op, inParameters);
                }
        }
        return inExpression;
    }



    //==========================================================================//


    private StringBuilder       builder = new StringBuilder();

}
