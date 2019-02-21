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
 * Holds the same getters and methods than the Service class.
 *
 * @author jldeleage
 */
public class OptionalService  {


    public static OptionalService ofNullable(Service inDelegate) {
        OptionalService result = new OptionalService();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public Service get() {
        return delegate;
    }


    //========================================================================//



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

    private     Service     delegate;


}