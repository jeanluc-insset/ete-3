package fr.upjv.mis.jl.ete.example.airways.model;


import fr.upjv.mis.jl.ete.example.airways.model.Customer;
import fr.upjv.mis.jl.ete.example.airways.model.ServiceLevel;
import fr.upjv.mis.jl.ete.example.airways.model.Membership;
import fr.upjv.mis.jl.ete.example.airways.model.ProgramPartner;
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
public class OptionalLoyaltyProgram  {


    public static OptionalLoyaltyProgram ofNullable(LoyaltyProgram inDelegate) {
        OptionalLoyaltyProgram result = new OptionalLoyaltyProgram();
        result.delegate = inDelegate;
        return result;
    }


    public boolean isPresent() {
        return delegate != null;
    }


    public LoyaltyProgram get() {
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


    public OptionalListMembership  getParticipants() {
        OptionalListMembership result = new OptionalListMembership();
        if (isPresent()) {
            result.setPresent(true);
            for (Membership anItem : delegate.getParticipants()) {
                result.add(OptionalMembership.ofNullable(anItem));
            }
        }
        return result;
    }


    public OptionalListProgramPartner  getPartners() {
        OptionalListProgramPartner result = new OptionalListProgramPartner();
        if (isPresent()) {
            result.setPresent(true);
            for (ProgramPartner anItem : delegate.getPartners()) {
                result.add(OptionalProgramPartner.ofNullable(anItem));
            }
        }
        return result;
    }


    public OptionalListServiceLevel  getLevels() {
        OptionalListServiceLevel result = new OptionalListServiceLevel();
        if (isPresent()) {
            result.setPresent(true);
            for (ServiceLevel anItem : delegate.getLevels()) {
                result.add(OptionalServiceLevel.ofNullable(anItem));
            }
        }
        return result;
    }




    //========================================================================//


    public void enroll(Customer c ) {
        if (isPresent()) {
            enroll(c );
        }
    }




    //========================================================================//

    private     LoyaltyProgram     delegate;


}