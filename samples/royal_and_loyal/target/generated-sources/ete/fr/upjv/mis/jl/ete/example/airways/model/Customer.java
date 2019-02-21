package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.CustomerCard;
import fr.upjv.mis.jl.ete.example.airways.model.Membership;
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
    @NamedQuery(name = "Customer.findByName", query = "SELECT f FROM Customer f WHERE f.name = :param"),
    @NamedQuery(name = "Customer.findByTitle", query = "SELECT f FROM Customer f WHERE f.title = :param"),
    @NamedQuery(name = "Customer.findByIsMale", query = "SELECT f FROM Customer f WHERE f.isMale = :param"),
    @NamedQuery(name = "Customer.findByDateOfBirth", query = "SELECT f FROM Customer f WHERE f.dateOfBirth = :param"),
    @NamedQuery(name = "Customer.findByAge", query = "SELECT f FROM Customer f WHERE f.age = :param"),
    @NamedQuery(name = "Customer.findByCards", query = "SELECT f FROM Customer f WHERE f.cards = :param"),
    @NamedQuery(name = "Customer.findByMemberships", query = "SELECT f FROM Customer f WHERE f.memberships = :param"),
    @NamedQuery(name = "Customer.findAll", query = "SELECT f FROM Customer f")
})
public class Customer  implements Serializable {


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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
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
    public String getTitle() {
        return title;
    }

    public void setTitle(String inValue) {
        title = inValue;
    }

    public Optional<String> getTitle$() {
        return Optional.ofNullable(title);
    }
    public boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(boolean inValue) {
        isMale = inValue;
    }

    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(java.util.Date inValue) {
        dateOfBirth = inValue;
    }

    public Optional<java.util.Date> getDateOfBirth$() {
        return Optional.ofNullable(dateOfBirth);
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer inValue) {
        age = inValue;
    }

    public List<CustomerCard> getCards() {
        return cards;
    }

    public void setCards(List<CustomerCard> inValue) {
        cards = inValue;
    }

    public void addCards(CustomerCard inValue) {
        cards.add(inValue);
    }

    public void removeCards(CustomerCard inValue) {
        cards.remove(inValue);
    }
    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> inValue) {
        memberships = inValue;
    }

    public void addMemberships(Membership inValue) {
        memberships.add(inValue);
    }

    public void removeMemberships(Membership inValue) {
        memberships.remove(inValue);
    }


    //========================================================================//




    @Override
    public String toString() {
        return "" + name;
    }

    //========================================================================//

            String      name;
            String      title;
            boolean      isMale;
            @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
        java.util.Date      dateOfBirth;
            Integer      age;
                @OneToMany (cascade = CascadeType.ALL)            List<CustomerCard>      cards = new LinkedList<>();
                @OneToMany             List<Membership>      memberships = new LinkedList<>();

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}