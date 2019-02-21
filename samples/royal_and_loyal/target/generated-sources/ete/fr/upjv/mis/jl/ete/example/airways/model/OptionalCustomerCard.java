package fr.upjv.mis.jl.ete.example.airways.model;


import fr.upjv.mis.jl.ete.example.airways.model.Customer;
import fr.upjv.mis.jl.ete.example.airways.Color;
import fr.upjv.mis.jl.ete.example.airways.model.EarningBurning;
import fr.upjv.mis.ete.util.OptionalList;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Convenient class to manage complex navigations without worrying of null
 * references.<br>
 * Holds the same getters and methods than the CustomerCard class.
 *
 * @author jldeleage
 */
public class OptionalCustomerCard  {


    public static OptionalCustomerCard ofNullable(CustomerCard inDelegate) {
        OptionalCustomerCard result = new OptionalCustomerCard();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public CustomerCard get() {
        return delegate;
    }


    //========================================================================//



    public Optional<Boolean> getValid() {
        Boolean newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getValid();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<java.util.Date> getValidFrom() {
        java.util.Date newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getValidFrom();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<java.util.Date> getGoodThru() {
        java.util.Date newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getGoodThru();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<Color> getColor() {
        Color newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getColor();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<String> getPrintedName() {
        String newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getPrintedName();
        }
        return Optional.ofNullable(newDelegate);
    }


    public OptionalCustomer getOwner() {
        Customer newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getOwner();
        }
        return OptionalCustomer.ofNullable(newDelegate);
    }


    public OptionalListEarningBurning  getTransactions() {
        OptionalListEarningBurning result = new OptionalListEarningBurning();
        if (isPresent()) {
            result.setPresent(true);
            for (EarningBurning anItem : delegate.getTransactions()) {
                result.add(OptionalEarningBurning.ofNullable(anItem));
            }
        }
        return result;
    }




    //========================================================================//






    //========================================================================//

    private     CustomerCard     delegate;


}