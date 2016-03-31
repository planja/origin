package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Никита on 30.03.2016.
 */

@Path("/rest_service")
public class RESTService {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getAllCustomers() {
        Pi pi = new Pi();
        pi.calculate(4, 10000, 10000);
        return Arrays.asList(String.valueOf(Pi.pi), String.valueOf(Pi.duration));
    }

    @GET
    @Path("/block")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> block() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        return Arrays.asList("hello get", "hi get");
    }

    @POST
    @Path("/post")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> addCustomer() {
        Pi pi = new Pi();
        pi.calculate(4, 10000, 10000);
        return Arrays.asList(String.valueOf(Pi.pi), String.valueOf(Pi.duration));
    }
}
