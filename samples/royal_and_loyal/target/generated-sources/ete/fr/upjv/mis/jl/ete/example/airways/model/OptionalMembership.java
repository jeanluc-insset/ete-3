package fr.upjv.mis.jl.ete.example.airways.model;


import fr.upjv.mis.jl.ete.example.airways.model.ServiceLevel;
import fr.upjv.mis.jl.ete.example.airways.model.CustomerCard;
import fr.upjv.mis.jl.ete.example.airways.model.LoyaltyAccount;
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
 * Holds the same getters and methods than the Membership class.
 *
 * @author jldeleage
 */
public class OptionalMembership  {


    public static OptionalMembership ofNullable(Membership inDelegate) {
        OptionalMembership result = new OptionalMembership();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public Membership get() {
        return delegate;
    }


    //========================================================================//



    public OptionalCustomerCard getCard() {
        CustomerCard newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getCard();
        }
        return OptionalCustomerCard.ofNullable(newDelegate);
    }


    public OptionalLoyaltyAccount getAccount() {
        LoyaltyAccount newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getAccount();
        }
        return OptionalLoyaltyAccount.ofNullable(newDelegate);
    }


    public OptionalServiceLevel getCurrentLevel() {
        ServiceLevel newDelegate;
        if (!isPresent()) {
            newDelegate = null;
        } else {
            newDelegate = delegate.getCurrentLevel();
        }
        return OptionalServiceLevel.ofNullable(newDelegate);
    }




    //========================================================================//






    //========================================================================//

    private     Membership     delegate;


}