package fr.insset.jeanluc.modeleur.model;



import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jldeleage
 */
@Entity
@XmlRootElement
public class Stereotype extends fr.insset.jeanluc.modeleur.model.Item  implements Serializable {


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
        if (!(object instanceof Stereotype)) {
            return false;
        }
        Stereotype other = (Stereotype) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    //========================================================================//




    //========================================================================//



    //========================================================================//




    @Override
    public String toString() {
        return super.toString();
    }

    //========================================================================//


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}