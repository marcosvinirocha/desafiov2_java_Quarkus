package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.scheduler.CounterBean;

@Path("/count")
public class CountResource {

    @Inject
    CounterBean counter;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "count: " + counter.get();
    }
}