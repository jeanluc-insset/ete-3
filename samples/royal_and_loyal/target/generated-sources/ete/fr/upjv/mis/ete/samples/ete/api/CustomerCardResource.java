package fr.upjv.mis.ete.samples.ete.api;


import fr.upjv.mis.jl.ete.example.airways.model.Customer;
import fr.upjv.mis.jl.ete.example.airways.Color;
import fr.upjv.mis.jl.ete.example.airways.model.EarningBurning;
import fr.upjv.mis.jl.ete.example.airways.model.CustomerCard;
import fr.upjv.mis.jl.ete.example.airways.jpa.CustomerCardJpa;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author jldeleage
 */
@Stateless
@Path("customerCard")
public class CustomerCardResource {


    @EJB
    CustomerCardJpa       ejbFacade;


    private CustomerCardJpa getFacade() {
        return ejbFacade;
    }



    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
     */

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(CustomerCard entity) {
        getFacade().create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, CustomerCard entity) {
        getFacade().edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        CustomerCardJpa  facade = getFacade();
        facade.remove(facade.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public CustomerCard find(@PathParam("id") Long id) {
        return getFacade().find(id);
    }

    @GET
    
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<CustomerCard> findAll() {
        return getFacade().findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<CustomerCard> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return getFacade().findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(getFacade().count());
    }


}