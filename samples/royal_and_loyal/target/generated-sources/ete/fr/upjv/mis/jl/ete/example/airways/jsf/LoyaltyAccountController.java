package fr.upjv.mis.jl.ete.example.airways.jsf;


import fr.upjv.mis.jl.ete.example.airways.model.LoyaltyAccount;
import fr.upjv.mis.ete.jsf.util.JsfUtil;
import fr.upjv.mis.ete.jsf.util.PaginationHelper;
import fr.upjv.mis.jl.ete.example.airways.jpa.LoyaltyAccountJpa;


import fr.upjv.mis.jl.ete.example.airways.model.EarningBurning;
import fr.upjv.mis.jl.ete.example.airways.model.Membership;
import fr.upjv.mis.jl.ete.example.airways.model.EarningBurning;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

// @Named("loyaltyAccountController")
// @SessionScoped
public class LoyaltyAccountController implements Serializable {

    private LoyaltyAccount current;
    private DataModel items = null;
    @EJB
    private LoyaltyAccountJpa ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;
    private Integer  earnAmount;
    private Integer  burnAmount;


    //========================================================================//


    public LoyaltyAccountController() {
    }

    public LoyaltyAccount getSelected() {
        if (current == null) {
            current = new LoyaltyAccount();
            selectedItemIndex = -1;
        }
        return current;
    }

    private LoyaltyAccountJpa getFacade() {
        return ejbFacade;
    }

    //========================================================================//
    //                          C O M P O N E N T S                           //
    //========================================================================//




    //========================================================================//
    //                          P A G I N A T I O N                           //
    //========================================================================//



    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "list";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "list";
    }

    //========================================================================//
    //                          O P E R A T I O N S                           //
    //========================================================================//


    public void earn() {
        try {
            getSelected().earn(earnAmount            );
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("LoyaltyAccountCreated"));
        }
        catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    public Integer getearnAmount() {
        return earnAmount;
    }

    public void setearnAmount(Integer inValue) {
        earnAmount = inValue;
    }


    public void burn() {
        try {
            getSelected().burn(burnAmount            );
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("LoyaltyAccountCreated"));
        }
        catch (Exception ex) {
            JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    public Integer getburnAmount() {
        return burnAmount;
    }

    public void setburnAmount(Integer inValue) {
        burnAmount = inValue;
    }




    //========================================================================//
    //        N A V I G A T I O N   W I T H I N   C R U D   P A G E S         //
    //========================================================================//


    public String prepareList() {
        recreateModel();
        return "list";
    }

    public String prepareView() {
        current = (LoyaltyAccount) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "view";
    }

    public String prepareCreate() {
        current = new LoyaltyAccount();
        selectedItemIndex = -1;
        return "create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("LoyaltyAccountCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (LoyaltyAccount) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("LoyaltyAccountUpdated"));
            return "view";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (LoyaltyAccount) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "list";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "view";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "list";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("LoyaltyAccountDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }


    //========================================================================//
    //       M O D E L S   F O R   T A B L E S   A N D   S E L E C T S        //
    //========================================================================//


    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public SelectItem[] getItemsAvailableAsAccountForMembershipSelectOne(Membership inFor) throws InstantiationException {
        return JsfUtil.getSelectItems(ejbFacade.getAllLoyaltyAccountAsAccountForMembership(inFor), true);
    }
    public SelectItem[] getItemsAvailableAsAccountForEarningBurningSelectOne(EarningBurning inFor) throws InstantiationException {
        return JsfUtil.getSelectItems(ejbFacade.getAllLoyaltyAccountAsAccountForEarningBurning(inFor), true);
    }

    public LoyaltyAccount getLoyaltyAccount(java.lang.Long id) {
        return ejbFacade.find(id);
    }


    //========================================================================//
    //                           C O N V E R T E R                            //
    //========================================================================//


    @FacesConverter(forClass = LoyaltyAccount.class)
    public static class LoyaltyAccountControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            LoyaltyAccountController controller = (LoyaltyAccountController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "loyaltyAccountController");
            return controller.getLoyaltyAccount(getKey(value));
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
            if (object instanceof LoyaltyAccount) {
                LoyaltyAccount o = (LoyaltyAccount) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + LoyaltyAccount.class.getName());
            }
        }

    }

}

