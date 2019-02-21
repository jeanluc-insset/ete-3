package fr.upjv.mis.jl.ete.example.airways.model;


import fr.upjv.mis.jl.ete.example.airways.model.CustomerCard;
import fr.upjv.mis.jl.ete.example.airways.model.Membership;
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
 * Holds the same getters and methods than the Customer class.
 *
 * @author jldeleage
 */
public class OptionalCustomer  {


    public static OptionalCustomer ofNullable(Customer inDelegate) {
        OptionalCustomer result = new OptionalCustomer();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public Customer get() {
        return delegate;
    }


    //========================================================================//



    public Optional<String> getName() {
        String newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getName();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<String> getTitle() {
        String newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getTitle();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<Boolean> getIsMale() {
        Boolean newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getIsMale();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<java.util.Date> getDateOfBirth() {
        java.util.Date newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getDateOfBirth();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<Integer> getAge() {
        Integer newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getAge();
        }
        return Optional.ofNullable(newDelegate);
    }


    public OptionalListCustomerCard  getCards() {
        OptionalListCustomerCard result = new OptionalListCustomerCard();
        if (isPresent()) {
            result.setPresent(true);
            for (CustomerCard anItem : delegate.getCards()) {
                result.add(OptionalCustomerCard.ofNullable(anItem));
            }
        }
        return result;
    }


    public OptionalListMembership  getMemberships() {
        OptionalListMembership result = new OptionalListMembership();
        if (isPresent()) {
            result.setPresent(true);
            for (Membership anItem : delegate.getMemberships()) {
                result.add(OptionalMembership.ofNullable(anItem));
            }
        }
        return result;
    }




    //========================================================================//






    //========================================================================//

    private     Customer     delegate;


}