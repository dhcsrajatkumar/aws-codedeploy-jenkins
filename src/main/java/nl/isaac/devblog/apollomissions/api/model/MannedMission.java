package nl.isaac.devblog.apollomissions.api.model;

import java.time.LocalDate;
import java.util.List;

import javax.json.bind.annotation.JsonbPropertyOrder;

@JsonbPropertyOrder({"id", "name", "crew", "launchDate"})
public class MannedMission {
    final Integer id;
    final String name;
    final List<Astronaut> crew;
    final LocalDate launchDate;

    public MannedMission(final Integer id, final String name, final List<Astronaut> crew, final LocalDate launchDate) {
        this.id = id;
        this.name = name;
        this.crew = crew;
        this.launchDate = launchDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Astronaut> getCrew() {
        return crew;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }
}
