package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.Service;
import fr.insset.jeanluc.util.factory.FactoryMethods;
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
public class OptionalListServiceLevel extends LinkedList<OptionalServiceLevel> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<ServiceLevel> get() throws InstantiationException {
        if (isPresent()) {
            List<ServiceLevel>    result = FactoryMethods.newList(ServiceLevel.class);
            for (OptionalServiceLevel item : this) {
                result.add(item.get());
            }
            return result;
        }
        throw new RuntimeException("Optional object is absent");
    }


    //========================================================================//





    public OptionalList<String> getName() {
        OptionalList<String>  result =  new OptionalList<String>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalServiceLevel item : this) {
                result.add(item.get().getName());
            }
        }
        return result;
    }
 
/*      // a collection of collections ! Not currently handled
    public OptionalListService  getAvailableServices() {
        OptionalListService result;
        if (isPresent()) {
            result = OptionalListService.ofNullable(null);
        }

        return result;
    }
*/




    //========================================================================//






    //========================================================================//

    private     boolean             present;


}