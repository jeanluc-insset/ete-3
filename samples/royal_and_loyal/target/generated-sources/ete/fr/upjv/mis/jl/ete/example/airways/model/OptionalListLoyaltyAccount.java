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
 * Holds the same getters and methods than the LoyaltyAccount class.
 *
 * @author jldeleage
 */
public class OptionalListLoyaltyAccount extends LinkedList<OptionalLoyaltyAccount> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<LoyaltyAccount> get() throws InstantiationException {
        if (isPresent()) {
            List<LoyaltyAccount>    result = FactoryMethods.newList(LoyaltyAccount.class);
            for (OptionalLoyaltyAccount item : this) {
                result.add(item.get());
            }
            return result;
        }
        throw new RuntimeException("Optional object is absent");
    }


    //========================================================================//





    public OptionalList<Integer> getPoints() {
        OptionalList<Integer>  result =  new OptionalList<Integer>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalLoyaltyAccount item : this) {
                result.add(item.get().getPoints());
            }
        }
        return result;
    }
 

    public OptionalList<Integer> getNumber() {
        OptionalList<Integer>  result =  new OptionalList<Integer>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalLoyaltyAccount item : this) {
                result.add(item.get().getNumber());
            }
        }
        return result;
    }
 
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

    private     boolean             present;


}