package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.Customer;
import fr.upjv.mis.jl.ete.example.airways.model.ServiceLevel;
import fr.upjv.mis.jl.ete.example.airways.model.Membership;
import fr.upjv.mis.jl.ete.example.airways.model.ProgramPartner;
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
 * Holds the same getters and methods than the LoyaltyProgram class.
 *
 * @author jldeleage
 */
public class OptionalListLoyaltyProgram extends LinkedList<OptionalLoyaltyProgram> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<LoyaltyProgram> get() throws InstantiationException {
        if (isPresent()) {
            List<LoyaltyProgram>    result = FactoryMethods.newList(LoyaltyProgram.class);
            for (OptionalLoyaltyProgram item : this) {
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
            for (OptionalLoyaltyProgram item : this) {
                result.add(item.get().getName());
            }
        }
        return result;
    }
 
/*      // a collection of collections ! Not currently handled
    public OptionalListMembership  getParticipants() {
        OptionalListMembership result;
        if (isPresent()) {
            result = OptionalListMembership.ofNullable(null);
        }

        return result;
    }
*/

/*      // a collection of collections ! Not currently handled
    public OptionalListProgramPartner  getPartners() {
        OptionalListProgramPartner result;
        if (isPresent()) {
            result = OptionalListProgramPartner.ofNullable(null);
        }

        return result;
    }
*/

/*      // a collection of collections ! Not currently handled
    public OptionalListServiceLevel  getLevels() {
        OptionalListServiceLevel result;
        if (isPresent()) {
            result = OptionalListServiceLevel.ofNullable(null);
        }

        return result;
    }
*/




    //========================================================================//


    public void enroll(Customer c ) {
        if (isPresent()) {
            enroll(c );
        }
    }




    //========================================================================//

    private     boolean             present;


}