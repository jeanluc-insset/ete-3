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
 * Holds the same getters and methods than the ProgramPartner class.
 *
 * @author jldeleage
 */
public class OptionalListProgramPartner extends LinkedList<OptionalProgramPartner> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<ProgramPartner> get() throws InstantiationException {
        if (isPresent()) {
            List<ProgramPartner>    result = FactoryMethods.newList(ProgramPartner.class);
            for (OptionalProgramPartner item : this) {
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
            for (OptionalProgramPartner item : this) {
                result.add(item.get().getName());
            }
        }
        return result;
    }
 
/*      // a collection of collections ! Not currently handled
    public OptionalListService  getDeliveredServices() {
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