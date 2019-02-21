package fr.upjv.mis.jl.ete.example.airways.model;


import fr.upjv.mis.jl.ete.example.airways.model.Service;
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
 * Holds the same getters and methods than the ServiceLevel class.
 *
 * @author jldeleage
 */
public class OptionalServiceLevel  {


    public static OptionalServiceLevel ofNullable(ServiceLevel inDelegate) {
        OptionalServiceLevel result = new OptionalServiceLevel();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public ServiceLevel get() {
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


    public OptionalListService  getAvailableServices() {
        OptionalListService result = new OptionalListService();
        if (isPresent()) {
            result.setPresent(true);
            for (Service anItem : delegate.getAvailableServices()) {
                result.add(OptionalService.ofNullable(anItem));
            }
        }
        return result;
    }




    //========================================================================//






    //========================================================================//

    private     ServiceLevel     delegate;


}