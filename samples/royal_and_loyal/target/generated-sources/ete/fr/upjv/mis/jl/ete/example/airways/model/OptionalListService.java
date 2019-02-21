package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.EarningBurning;
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
 * Holds the same getters and methods than the Service class.
 *
 * @author jldeleage
 */
public class OptionalListService extends LinkedList<OptionalService> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<Service> get() throws InstantiationException {
        if (isPresent()) {
            List<Service>    result = FactoryMethods.newList(Service.class);
            for (OptionalService item : this) {
                result.add(item.get());
            }
            return result;
        }
        throw new RuntimeException("Optional object is absent");
    }


    //========================================================================//




/*      // a collection of collections ! Not currently handled
    public OptionalListEarningBurning  getTransactions() {
        OptionalListEarningBurning result;
        if (isPresent()) {
            result = OptionalListEarningBurning.ofNullable(null);
        }

        return result;
    }
*/




    //========================================================================//






    //========================================================================//

    private     boolean             present;


}