package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/quarkus")
public class GreetingResource {

    @GET
    @Path("example")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @POST
    @Path("/test_time")
    @Produces(MediaType.TEXT_PLAIN)
    public String testQuarkus() {
        return "Darwin Coba Quarkus";
    }


}
