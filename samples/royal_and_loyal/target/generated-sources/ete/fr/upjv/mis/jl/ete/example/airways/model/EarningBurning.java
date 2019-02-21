package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.LoyaltyAccount;
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
    @NamedQuery(name = "EarningBurning.findByAccount", query = "SELECT f FROM EarningBurning f WHERE f.account = :param"),
    @NamedQuery(name = "EarningBurning.findAll", query = "SELECT f FROM EarningBurning f")
})
public class EarningBurning  implements Serializable {


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
        if (!(object instanceof EarningBurning)) {
            return false;
        }
        EarningBurning other = (EarningBurning) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    //========================================================================//




    //========================================================================//

    public LoyaltyAccount getAccount() {
        return account;
    }

    public void setAccount(LoyaltyAccount inValue) {
        account = inValue;
    }

    public OptionalLoyaltyAccount getAccount$() {
        return OptionalLoyaltyAccount.ofNullable(account);
    }


    //========================================================================//




    @Override
    public String toString() {
        return "" + account;
    }

    //========================================================================//

        @ManyToOne             LoyaltyAccount      account;

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}