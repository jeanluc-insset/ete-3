package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.EarningBurning;
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
    @NamedQuery(name = "LoyaltyAccount.findByPoints", query = "SELECT f FROM LoyaltyAccount f WHERE f.points = :param"),
    @NamedQuery(name = "LoyaltyAccount.findByNumber", query = "SELECT f FROM LoyaltyAccount f WHERE f.number = :param"),
    @NamedQuery(name = "LoyaltyAccount.findByTransactions", query = "SELECT f FROM LoyaltyAccount f WHERE f.transactions = :param"),
    @NamedQuery(name = "LoyaltyAccount.findAll", query = "SELECT f FROM LoyaltyAccount f")
})
public class LoyaltyAccount  implements Serializable {


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
        if (!(object instanceof LoyaltyAccount)) {
            return false;
        }
        LoyaltyAccount other = (LoyaltyAccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    //========================================================================//




    //========================================================================//

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer inValue) {
        points = inValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer inValue) {
        number = inValue;
    }

    public List<EarningBurning> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<EarningBurning> inValue) {
        transactions = inValue;
    }

    public void addTransactions(EarningBurning inValue) {
        transactions.add(inValue);
    }

    public void removeTransactions(EarningBurning inValue) {
        transactions.remove(inValue);
    }


    //========================================================================//


    public void earn(Integer amount ) {

    }
    public void burn(Integer amount ) {

    }


    @Override
    public String toString() {
        return "" + points;
    }

    //========================================================================//

            Integer      points;
            Integer      number;
                @OneToMany             List<EarningBurning>      transactions = new LinkedList<>();

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}