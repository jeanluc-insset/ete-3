package fr.upjv.mis.jl.ete.example.airways.model;


import fr.upjv.mis.jl.ete.example.airways.model.LoyaltyAccount;
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
 * Holds the same getters and methods than the Burning class.
 *
 * @author jldeleage
 */
public class OptionalBurning extends fr.upjv.mis.jl.ete.example.airways.model.OptionalEarningBurning  {


    public static OptionalBurning ofNullable(Burning inDelegate) {
        OptionalBurning result = new OptionalBurning();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public Burning get() {
        return delegate;
    }


    //========================================================================//





    //========================================================================//






    //========================================================================//

    private     Burning     delegate;


}