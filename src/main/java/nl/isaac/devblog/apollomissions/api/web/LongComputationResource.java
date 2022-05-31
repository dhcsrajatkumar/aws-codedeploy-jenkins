package nl.isaac.devblog.apollomissions.api.web;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/longComputation")
@Produces(MediaType.TEXT_PLAIN)
public class LongComputationResource {
    private static final Integer EARTH_TO_MOON_DISTANCE_IN_KM = 384_400;

    @GET
    public String longComputation() {
        Random random = new SecureRandom();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(Math.abs(random.nextInt()));
        }
        boolean contains = numbers.contains(EARTH_TO_MOON_DISTANCE_IN_KM);
        return String.format("Number %s exists in the array of %s numbers: %s.", EARTH_TO_MOON_DISTANCE_IN_KM, numbers.size(), contains);
    }
}
