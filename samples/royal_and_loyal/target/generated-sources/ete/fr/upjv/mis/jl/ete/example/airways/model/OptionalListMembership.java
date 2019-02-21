package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.ServiceLevel;
import fr.upjv.mis.jl.ete.example.airways.model.CustomerCard;
import fr.upjv.mis.jl.ete.example.airways.model.LoyaltyAccount;
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
 * Holds the same getters and methods than the Membership class.
 *
 * @author jldeleage
 */
public class OptionalListMembership extends LinkedList<OptionalMembership> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<Membership> get() throws InstantiationException {
        if (isPresent()) {
            List<Membership>    result = FactoryMethods.newList(Membership.class);
            for (OptionalMembership item : this) {
                result.add(item.get());
            }
            return result;
        }
        throw new RuntimeException("Optional object is absent");
    }


    //========================================================================//





    public OptionalListCustomerCard getCard() {
        OptionalListCustomerCard  result =  new OptionalListCustomerCard();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalMembership item : this) {
                result.add(item.getCard());
            }
        }
        return result;
    }


    public OptionalListLoyaltyAccount getAccount() {
        OptionalListLoyaltyAccount  result =  new OptionalListLoyaltyAccount();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalMembership item : this) {
                result.add(item.getAccount());
            }
        }
        return result;
    }


    public OptionalListServiceLevel getCurrentLevel() {
        OptionalListServiceLevel  result =  new OptionalListServiceLevel();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalMembership item : this) {
                result.add(item.getCurrentLevel());
            }
        }
        return result;
    }




    //========================================================================//






    //========================================================================//

    private     boolean             present;


}