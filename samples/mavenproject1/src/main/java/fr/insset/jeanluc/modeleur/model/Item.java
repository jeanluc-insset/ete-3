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
public class Item  implements Serializable {


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
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    //========================================================================//




    //========================================================================//

    public String getNom() {
        return nom;
    }

    public void setNom(String inValue) {
        nom = inValue;
    }

    public List<Stereotype> getStereotypes() {
        return stereotypes;
    }

    public void setStereotypes(List<Stereotype> inValue) {
        stereotypes = inValue;
    }

    public void addStereotypes(Stereotype inValue) {
        stereotypes.add(inValue);
    }

    public void removeStereotypes(Stereotype inValue) {
        stereotypes.remove(inValue);
    }
    public TypeItem getTypeItem() {
        return typeItem;
    }

    public void setTypeItem(TypeItem inValue) {
        typeItem = inValue;
    }

    public List<Item> getContenu() {
        return contenu;
    }

    public void setContenu(List<Item> inValue) {
        contenu = inValue;
    }

    public void addContenu(Item inValue) {
        contenu.add(inValue);
    }

    public void removeContenu(Item inValue) {
        contenu.remove(inValue);
    }


    //========================================================================//




    @Override
    public String toString() {
        return "" + nom;
    }

    //========================================================================//

            String      nom;
                @OneToMany 
            List<Stereotype>      stereotypes;
        @ManyToOne 
            TypeItem      typeItem;
                @OneToMany 
            List<Item>      contenu;

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


}