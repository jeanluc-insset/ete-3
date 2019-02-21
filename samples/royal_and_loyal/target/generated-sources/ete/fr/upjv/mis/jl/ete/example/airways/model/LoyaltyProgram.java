package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.Customer;
import fr.upjv.mis.jl.ete.example.airways.model.ServiceLevel;
import fr.upjv.mis.jl.ete.example.airways.model.Membership;
import fr.upjv.mis.jl.ete.example.airways.model.ProgramPartner;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import javax.persistence.CascadeType;
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
 *
 * @author jldeleage
 */
@Generated("ETE - mda/modules/jpa/class2entity.vm")
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoyaltyProgram.findByName", query = "SELECT f FROM LoyaltyProgram f WHERE f.name = :param"),
    @NamedQuery(name = "LoyaltyProgram.findByParticipants", query = "SELECT f FROM LoyaltyProgram f WHERE f.participants = :param"),
    @NamedQuery(name = "LoyaltyProgram.findByPartners", query = "SELECT f FROM LoyaltyProgram f WHERE f.partners = :param"),
    @NamedQuery(name = "LoyaltyProgram.findByLevels", query = "SELECT f FROM LoyaltyProgram f WHERE f.levels = :param"),
    @NamedQuery(name = "LoyaltyProgram.findAll", query = "SELECT f FROM LoyaltyProgram f")
})
public class LoyaltyProgram  implements Serializable {


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    //========================================================================//


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoyaltyProgram)) {
            return false;
        }
        LoyaltyProgram other = (LoyaltyProgram) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    //========================================================================//




    //========================================================================//

    public String getName() {
        return name;
    }

    public void setName(String inValue) {
        name = inValue;
    }

    public Optional<String> getName$() {
        return Optional.ofNullable(name);
    }
    public List<Membership> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Membership> inValue) {
        participants = inValue;
    }

    public void addParticipants(Membership inValue) {
        participants.add(inValue);
    }

    public void removeParticipants(Membership inValue) {
        participants.remove(inValue);
    }
    public List<ProgramPartner> getPartners() {
        return partners;
    }

    public void setPartners(List<ProgramPartner> inValue) {
        partners = inValue;
    }

    public void addPartners(ProgramPartner inValue) {
        partners.add(inValue);
    }

    public void removePartners(ProgramPartner inValue) {
        partners.remove(inValue);
    }
    public List<ServiceLevel> getLevels() {
        return levels;
    }

    public void setLevels(List<ServiceLevel> inValue) {
        levels = inValue;
    }

    public void addLevels(ServiceLevel inValue) {
        levels.add(inValue);
    }

    public void removeLevels(ServiceLevel inValue) {
        levels.remove(inValue);
    }


    //========================================================================//


    public void enroll(Customer c ) {

    }


    @Override
    public String toString() {
        return "" + name;
    }

    //========================================================================//

            String      name;
                @OneToMany             List<Membership>      participants = new LinkedList<>();
                @OneToMany             List<ProgramPartner>      partners = new LinkedList<>();
                @OneToMany             List<ServiceLevel>      levels = new LinkedList<>();

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}