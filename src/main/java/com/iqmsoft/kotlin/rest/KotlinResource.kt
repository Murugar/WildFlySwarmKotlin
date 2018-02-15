package com.iqmsoft.kotlin.rest

import javax.ws.rs.Path
import javax.ws.rs.GET
import javax.ejb.Stateless


@Path("/")
@Stateless
class KotlinResource {

   
    @GET
    public fun get() : String {
        return "Hello from WildFly Swarm Kotlin " + java.util.Date()
    }
    
    @GET
    @Path("/username")
    public fun getUsername() : String {
        return "test";
    }

}
