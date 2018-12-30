/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insset.jeanluc.action.semantics.builder;

import fr.insset.jeanluc.ete.meta.model.emof.MofProperty;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author jldeleage
 */
public class EteQuery {



    public List<EteFilter> getFilters() {
        return filters;
    }

    public MofProperty getProperty() {
        return property;
    }

    public void setProperty(MofProperty property) {
        this.property = property;
    }



    public void addFilter(EteFilter filter) {
        filters.add(filter);
    }

    private     List<EteFilter> filters = new LinkedList();
    private     MofProperty     property;

}
