package org.devil;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api")
public class GreetingResource {

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MyEntity> get() {
        return MyEntity.listAll();
    }

    @POST
    @Path("/add")
    @Transactional
    public void post() {
        MyEntity myEntity = new MyEntity();
        myEntity.field = "Hello";
        myEntity.persist();
    }
}
