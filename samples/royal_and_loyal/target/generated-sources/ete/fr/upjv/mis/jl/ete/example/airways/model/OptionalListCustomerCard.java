package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.Customer;
import fr.upjv.mis.jl.ete.example.airways.Color;
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
 * Holds the same getters and methods than the CustomerCard class.
 *
 * @author jldeleage
 */
public class OptionalListCustomerCard extends LinkedList<OptionalCustomerCard> {





    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean inPresent) {
        present = inPresent;
    }


    /**
     * 
     */
    public List<CustomerCard> get() throws InstantiationException {
        if (isPresent()) {
            List<CustomerCard>    result = FactoryMethods.newList(CustomerCard.class);
            for (OptionalCustomerCard item : this) {
                result.add(item.get());
            }
            return result;
        }
        throw new RuntimeException("Optional object is absent");
    }


    //========================================================================//





    public OptionalList<Boolean> getValid() {
        OptionalList<Boolean>  result =  new OptionalList<Boolean>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomerCard item : this) {
                result.add(item.get().getValid());
            }
        }
        return result;
    }
 

    public OptionalList<java.util.Date> getValidFrom() {
        OptionalList<java.util.Date>  result =  new OptionalList<java.util.Date>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomerCard item : this) {
                result.add(item.get().getValidFrom());
            }
        }
        return result;
    }
 

    public OptionalList<java.util.Date> getGoodThru() {
        OptionalList<java.util.Date>  result =  new OptionalList<java.util.Date>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomerCard item : this) {
                result.add(item.get().getGoodThru());
            }
        }
        return result;
    }
 

    public OptionalList<Color> getColor() {
        OptionalList<Color>  result =  new OptionalList<Color>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomerCard item : this) {
                result.add(item.get().getColor());
            }
        }
        return result;
    }
 

    public OptionalList<String> getPrintedName() {
        OptionalList<String>  result =  new OptionalList<String>();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomerCard item : this) {
                result.add(item.get().getPrintedName());
            }
        }
        return result;
    }
 

    public OptionalListCustomer getOwner() {
        OptionalListCustomer  result =  new OptionalListCustomer();
        if (isPresent()) {
            result.setPresent(present);
            for (OptionalCustomerCard item : this) {
                result.add(item.getOwner());
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






    //========================================================================//

    private     boolean             present;


}