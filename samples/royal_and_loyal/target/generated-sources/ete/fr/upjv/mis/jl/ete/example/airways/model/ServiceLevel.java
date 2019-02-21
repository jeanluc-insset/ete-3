package fr.upjv.mis.jl.ete.example.airways.model;



import fr.upjv.mis.jl.ete.example.airways.model.Service;
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
    @NamedQuery(name = "ServiceLevel.findByName", query = "SELECT f FROM ServiceLevel f WHERE f.name = :param"),
    @NamedQuery(name = "ServiceLevel.findByAvailableServices", query = "SELECT f FROM ServiceLevel f WHERE f.availableServices = :param"),
    @NamedQuery(name = "ServiceLevel.findAll", query = "SELECT f FROM ServiceLevel f")
})
public class ServiceLevel  implements Serializable {


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
        if (!(object instanceof ServiceLevel)) {
            return false;
        }
        ServiceLevel other = (ServiceLevel) object;
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
    public List<Service> getAvailableServices() {
        return availableServices;
    }

    public void setAvailableServices(List<Service> inValue) {
        availableServices = inValue;
    }

    public void addAvailableServices(Service inValue) {
        availableServices.add(inValue);
    }

    public void removeAvailableServices(Service inValue) {
        availableServices.remove(inValue);
    }


    //========================================================================//




    @Override
    public String toString() {
        return "" + name;
    }

    //========================================================================//

            String      name;
                @OneToMany             List<Service>      availableServices = new LinkedList<>();

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}