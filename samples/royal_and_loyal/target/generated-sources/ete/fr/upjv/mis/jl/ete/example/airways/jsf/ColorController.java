package fr.upjv.mis.jl.ete.example.airways.jsf;


import fr.upjv.mis.jl.ete.example.airways.Color;
import fr.upjv.mis.ete.jsf.util.JsfUtil;
import fr.upjv.mis.ete.jsf.util.PaginationHelper;



import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("colorController")
@ApplicationScoped
public class ColorController implements Serializable {

    private Color current;
    private DataModel items = null;



    //========================================================================//
    //                          C O M P O N E N T S                           //
    //========================================================================//


/*
*/


    //========================================================================//
    //                          O P E R A T I O N S                           //
    //========================================================================//


/*
*/


    //========================================================================//
    //       M O D E L S   F O R   T A B L E S   A N D   S E L E C T S        //
    //========================================================================//


    public SelectItem[] getItemsAvailableSelectMany() {
        SelectItem[]    result = new SelectItem[Color.values().length];
        // new SelectItem(Color.${aLiteral.value()}, "${aLiteral.value()}");
        // new SelectItem(Color.${aLiteral.value()}, "${aLiteral.value()}");
        for (int i=0 ; i<Color.values().length ; i++) {
            result[i] = new SelectItem(Color.values()[i], Color.values()[i].name());
        }
        return result;
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        SelectItem[]    result = new SelectItem[Color.values().length+1];
        result[0] = new SelectItem(null, "---");
        for (int i=0 ; i<Color.values().length ; i++) {
            result[i+1] = new SelectItem(Color.values()[i], Color.values()[i].name());
        }
        return result;
    }




    //========================================================================//
    //                           C O N V E R T E R                            //
    //========================================================================//

/*
    @FacesConverter(forClass = Color.class)
    public static class ColorControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ColorController controller = (ColorController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "colorController");
            return controller.getColor(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Color) {
                Color o = (Color) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Color.class.getName());
            }
        }

    }
*/

}

