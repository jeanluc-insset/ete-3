package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.Customer;
import fr.upjv.mis.jl.ete.example.airways.Color;
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
    @NamedQuery(name = "CustomerCard.findByValid", query = "SELECT f FROM CustomerCard f WHERE f.valid = :param"),
    @NamedQuery(name = "CustomerCard.findByValidFrom", query = "SELECT f FROM CustomerCard f WHERE f.validFrom = :param"),
    @NamedQuery(name = "CustomerCard.findByGoodThru", query = "SELECT f FROM CustomerCard f WHERE f.goodThru = :param"),
    @NamedQuery(name = "CustomerCard.findByColor", query = "SELECT f FROM CustomerCard f WHERE f.color = :param"),
    @NamedQuery(name = "CustomerCard.findByPrintedName", query = "SELECT f FROM CustomerCard f WHERE f.printedName = :param"),
    @NamedQuery(name = "CustomerCard.findByOwner", query = "SELECT f FROM CustomerCard f WHERE f.owner = :param"),
    @NamedQuery(name = "CustomerCard.findByTransactions", query = "SELECT f FROM CustomerCard f WHERE f.transactions = :param"),
    @NamedQuery(name = "CustomerCard.findAll", query = "SELECT f FROM CustomerCard f")
})
public class CustomerCard  implements Serializable {


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
        if (!(object instanceof CustomerCard)) {
            return false;
        }
        CustomerCard other = (CustomerCard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    //========================================================================//




    //========================================================================//

    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean inValue) {
        valid = inValue;
    }

    public java.util.Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(java.util.Date inValue) {
        validFrom = inValue;
    }

    public Optional<java.util.Date> getValidFrom$() {
        return Optional.ofNullable(validFrom);
    }
    public java.util.Date getGoodThru() {
        return goodThru;
    }

    public void setGoodThru(java.util.Date inValue) {
        goodThru = inValue;
    }

    public Optional<java.util.Date> getGoodThru$() {
        return Optional.ofNullable(goodThru);
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color inValue) {
        color = inValue;
    }

    public String getPrintedName() {
        return printedName;
    }

    public void setPrintedName(String inValue) {
        printedName = inValue;
    }

    public Optional<String> getPrintedName$() {
        return Optional.ofNullable(printedName);
    }
    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer inValue) {
        owner = inValue;
    }

    public OptionalCustomer getOwner$() {
        return OptionalCustomer.ofNullable(owner);
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




    @Override
    public String toString() {
        return "" + valid;
    }

    //========================================================================//

            boolean      valid;
            @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
        java.util.Date      validFrom;
            @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
        java.util.Date      goodThru;
            Color      color;
            String      printedName;
        @ManyToOne             Customer      owner;
                @OneToMany             List<EarningBurning>      transactions = new LinkedList<>();

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}