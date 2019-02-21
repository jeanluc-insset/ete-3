package fr.upjv.mis.jl.ete.example.airways.model;


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
 * Holds the same getters and methods than the LoyaltyAccount class.
 *
 * @author jldeleage
 */
public class OptionalLoyaltyAccount  {


    public static OptionalLoyaltyAccount ofNullable(LoyaltyAccount inDelegate) {
        OptionalLoyaltyAccount result = new OptionalLoyaltyAccount();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public LoyaltyAccount get() {
        return delegate;
    }


    //========================================================================//



    public Optional<Integer> getPoints() {
        Integer newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getPoints();
        }
        return Optional.ofNullable(newDelegate);
    }


    public Optional<Integer> getNumber() {
        Integer newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getNumber();
        }
        return Optional.ofNullable(newDelegate);
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


    public void earn(Integer amount ) {
        if (isPresent()) {
            earn(amount );
        }
    }
    public void burn(Integer amount ) {
        if (isPresent()) {
            burn(amount );
        }
    }




    //========================================================================//

    private     LoyaltyAccount     delegate;


}