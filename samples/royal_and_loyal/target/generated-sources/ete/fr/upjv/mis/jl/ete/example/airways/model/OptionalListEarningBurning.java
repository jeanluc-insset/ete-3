package fr.upjv.mis.jl.ete.example.airways.model;



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
 * Holds the same getters and methods than the EarningBurning class.
 *
 * @author jldeleage
 */
public class OptionalListEarningBurning extends LinkedList<OptionalEarningBurning> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<EarningBurning> get() throws InstantiationException {
        if (isPresent()) {
            List<EarningBurning>    result = FactoryMethods.newList(EarningBurning.class);
            for (OptionalEarningBurning item : this) {
                result.add(item.get());
            }
            return result;
        }
        throw new RuntimeException("Optional object is absent");
    }


    //========================================================================//





    public OptionalListLoyaltyAccount getAccount() {
        OptionalListLoyaltyAccount  result =  new OptionalListLoyaltyAccount();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalEarningBurning item : this) {
                result.add(item.getAccount());
            }
        }
        return result;
    }




    //========================================================================//






    //========================================================================//

    private     boolean             present;


}