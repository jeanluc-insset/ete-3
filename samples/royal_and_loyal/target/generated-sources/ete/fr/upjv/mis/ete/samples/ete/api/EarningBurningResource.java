package fr.upjv.mis.ete.samples.ete.api;


import fr.upjv.mis.jl.ete.example.airways.model.LoyaltyAccount;
import fr.upjv.mis.jl.ete.example.airways.model.EarningBurning;
import fr.upjv.mis.jl.ete.example.airways.jpa.EarningBurningJpa;
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
@Path("earningBurning")
public class EarningBurningResource {


    @EJB
    EarningBurningJpa       ejbFacade;


    private EarningBurningJpa getFacade() {
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
    public void create(EarningBurning entity) {
        getFacade().create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, EarningBurning entity) {
        getFacade().edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        EarningBurningJpa  facade = getFacade();
        facade.remove(facade.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public EarningBurning find(@PathParam("id") Long id) {
        return getFacade().find(id);
    }

    @GET
    
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<EarningBurning> findAll() {
        return getFacade().findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<EarningBurning> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return getFacade().findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(getFacade().count());
    }


}