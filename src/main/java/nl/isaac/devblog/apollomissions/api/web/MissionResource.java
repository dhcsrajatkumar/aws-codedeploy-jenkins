package nl.isaac.devblog.apollomissions.api.web;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nl.isaac.devblog.apollomissions.api.data.MannedMissionData;
import nl.isaac.devblog.apollomissions.api.model.MannedMission;
import nl.isaac.devblog.apollomissions.api.model.MannedMissionEnum;

@Path("/missions")
@Produces(MediaType.APPLICATION_JSON)
public class MissionResource {
    @Path("/manned")
    @GET
    public List<MannedMission> mannedMissions() {
        return new ArrayList<>(MannedMissionData.missions.values());
    }

    @Path("/manned/{missionId}")
    @GET
    public MannedMission mannedMission(@PathParam("missionId") final Integer id) {
        MannedMissionEnum mission = MannedMissionEnum.from(id);
        if (mission == null) {
            throw new NotFoundException();
        }

        return MannedMissionData.missions.get(mission);
    }
}
