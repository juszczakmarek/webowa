package pl.sda.java5;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/kalkulator")
public class Kalkulator {

    @GET
    @Path("/czesc")
    @Produces(MediaType.TEXT_PLAIN)
    public String czesc(@QueryParam("imie") String imie) {
        return "czesc ludku o imieniu" + imie;
    }

    @GET
    @Path("/dodajsciezka/{pierwszy}/{drugi}")
    @Produces(MediaType.TEXT_PLAIN)
    public String dodajSciezkaGet(@PathParam("pierwszy") String pierwszy, @PathParam("drugi") String drugi){
        return pierwszy + drugi;
    }
}