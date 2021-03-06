/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cofares;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author pascalfares
 */
@Path("sw")
public class Second {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Second
     */
    public Second() {
    }

    /**
     * Retrieves representation of an instance of net.cofares.Second
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Path("{id}")
    public String getText(@PathParam("id") int id) {
        return "GET: Hello ca fonctionne ..."+id;
    }

    /**
     * PUT method for updating or creating an instance of Second
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    @Produces("text/plain")
    public String putText(String content) {
        return "PUT: Hello ca fonctionne ..."+content;
    }
}
