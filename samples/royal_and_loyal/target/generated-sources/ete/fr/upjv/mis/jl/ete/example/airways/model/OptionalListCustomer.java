package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.CustomerCard;
import fr.upjv.mis.jl.ete.example.airways.model.Membership;
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
 * Holds the same getters and methods than the Customer class.
 *
 * @author jldeleage
 */
public class OptionalListCustomer extends LinkedList<OptionalCustomer> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<Customer> get() throws InstantiationException {
        if (isPresent()) {
            List<Customer>    result = FactoryMethods.newList(Customer.class);
            for (OptionalCustomer item : this) {
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
            for (OptionalCustomer item : this) {
                result.add(item.get().getName());
            }
        }
        return result;
    }
 

    public OptionalList<String> getTitle() {
        OptionalList<String>  result =  new OptionalList<String>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomer item : this) {
                result.add(item.get().getTitle());
            }
        }
        return result;
    }
 

    public OptionalList<Boolean> getIsMale() {
        OptionalList<Boolean>  result =  new OptionalList<Boolean>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomer item : this) {
                result.add(item.get().getIsMale());
            }
        }
        return result;
    }
 

    public OptionalList<java.util.Date> getDateOfBirth() {
        OptionalList<java.util.Date>  result =  new OptionalList<java.util.Date>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomer item : this) {
                result.add(item.get().getDateOfBirth());
            }
        }
        return result;
    }
 

    public OptionalList<Integer> getAge() {
        OptionalList<Integer>  result =  new OptionalList<Integer>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomer item : this) {
                result.add(item.get().getAge());
            }
        }
        return result;
    }
 
/*      // a collection of collections ! Not currently handled
    public OptionalListCustomerCard  getCards() {
        OptionalListCustomerCard result;
        if (isPresent()) {
            result = OptionalListCustomerCard.ofNullable(null);
        }

        return result;
    }
*/

/*      // a collection of collections ! Not currently handled
    public OptionalListMembership  getMemberships() {
        OptionalListMembership result;
        if (isPresent()) {
            result = OptionalListMembership.ofNullable(null);
        }

        return result;
    }
*/




    //========================================================================//






    //========================================================================//

    private     boolean             present;


}