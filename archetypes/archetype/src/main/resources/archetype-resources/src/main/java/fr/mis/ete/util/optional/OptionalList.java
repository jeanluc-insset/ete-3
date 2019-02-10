#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.mis.ete.util.optional;

import java.util.LinkedList;
import java.util.List;

/**
 * An OptionalList 
 *
 * @author jldeleage
 */
public class OptionalList<T> {

    public List<T> get() {
        return delegate;
    }



    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }


    public void add(T t) {
        if (isPresent()) {
            delegate.add(t);
        }
    }

    private     List<T>     delegate = new LinkedList<>();
    private     boolean     present;

}
