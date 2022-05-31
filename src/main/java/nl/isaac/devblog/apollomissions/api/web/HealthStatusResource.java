package nl.isaac.devblog.apollomissions.api.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/health")
@Produces(MediaType.TEXT_PLAIN)
public class HealthStatusResource {
    @GET
    public String healthStatus() {
        return "Healthy";
    }
}
