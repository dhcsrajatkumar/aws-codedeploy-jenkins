package nl.isaac.devblog.apollomissions.api.data;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import nl.isaac.devblog.apollomissions.api.model.Astronaut;
import nl.isaac.devblog.apollomissions.api.model.MannedMissionEnum;
import nl.isaac.devblog.apollomissions.api.model.MannedMission;

public final class MannedMissionData {
    public static final Map<MannedMissionEnum, List<Astronaut>> crew;
    public static final Map<MannedMissionEnum, LocalDate> launchDates;
    public static final Map<MannedMissionEnum, MannedMission> missions;

    static {
        crew = new EnumMap<>(MannedMissionEnum.class);
        initCrew();

        launchDates = new EnumMap<>(MannedMissionEnum.class);
        initLaunchDates();

        missions = new EnumMap<>(MannedMissionEnum.class);
        initMannedMissions();
    }

    private static void initCrew() {
        crew.put(MannedMissionEnum.APOLLO_1,
                Arrays.asList(
                        new Astronaut("Virgil", "Grissom"),
                        new Astronaut("Edward", "White"),
                        new Astronaut("Roger", "Chaffee")
                ));
        crew.put(MannedMissionEnum.APOLLO_7,
                Arrays.asList(
                        new Astronaut("Walter", "Schirra"),
                        new Astronaut("Walter", "Cunningham"),
                        new Astronaut("Donn", "Eisele")
                ));
        crew.put(MannedMissionEnum.APOLLO_8,
                Arrays.asList(
                        new Astronaut("Frank", "Borman"),
                        new Astronaut("William", "Anders"),
                        new Astronaut("James", "Lovell")
                ));
        crew.put(MannedMissionEnum.APOLLO_9,
                Arrays.asList(
                        new Astronaut("James", "McDivitt"),
                        new Astronaut("Russell", "Schweickart"),
                        new Astronaut("David", "Scott")
                ));
        crew.put(MannedMissionEnum.APOLLO_10,
                Arrays.asList(
                        new Astronaut("Thomas", "Stafford"),
                        new Astronaut("Eugene", "Cernan"),
                        new Astronaut("John", "Young")
                ));
        crew.put(MannedMissionEnum.APOLLO_11,
                Arrays.asList(
                        new Astronaut("Neil", "Armstrong"),
                        new Astronaut("Edwin", "Aldrin"),
                        new Astronaut("Michael", "Collins")
                ));
        crew.put(MannedMissionEnum.APOLLO_12,
                Arrays.asList(
                        new Astronaut("Charles", "Conrad"),
                        new Astronaut("Alan", "Bean"),
                        new Astronaut("Richard", "Gordon")
                ));
        crew.put(MannedMissionEnum.APOLLO_13,
                Arrays.asList(
                        new Astronaut("James ", "Lovell"),
                        new Astronaut("Fred", "Haise"),
                        new Astronaut("John", "Swigert")
                ));
        crew.put(MannedMissionEnum.APOLLO_14,
                Arrays.asList(
                        new Astronaut("Alan", "Shepard"),
                        new Astronaut("Edgar", "Mitchell"),
                        new Astronaut("Stuart", "Roosa")
                ));
        crew.put(MannedMissionEnum.APOLLO_15,
                Arrays.asList(
                        new Astronaut("David", "Scott"),
                        new Astronaut("James", "Irwin"),
                        new Astronaut("Alfred", "Worden")
                ));
        crew.put(MannedMissionEnum.APOLLO_16,
                Arrays.asList(
                        new Astronaut("John", "Young"),
                        new Astronaut("Charles", "Duke"),
                        new Astronaut("Thomas", "Mattingly")
                ));
        crew.put(MannedMissionEnum.APOLLO_17,
                Arrays.asList(
                        new Astronaut("Eugene", "Cernan"),
                        new Astronaut("Harrison", "Schmitt"),
                        new Astronaut("Ronald", "Evans")
                ));
    }

    private static void initLaunchDates() {
        launchDates.put(MannedMissionEnum.APOLLO_1, LocalDate.of(1967, Month.JANUARY, 27));
        launchDates.put(MannedMissionEnum.APOLLO_7, LocalDate.of(1968, Month.OCTOBER, 11));
        launchDates.put(MannedMissionEnum.APOLLO_8, LocalDate.of(1968, Month.DECEMBER, 21));
        launchDates.put(MannedMissionEnum.APOLLO_9, LocalDate.of(1969, Month.MARCH, 3));
        launchDates.put(MannedMissionEnum.APOLLO_10, LocalDate.of(1969, Month.MAY, 18));
        launchDates.put(MannedMissionEnum.APOLLO_11, LocalDate.of(1969, Month.JULY, 16));
        launchDates.put(MannedMissionEnum.APOLLO_12, LocalDate.of(1969, Month.NOVEMBER, 14));
        launchDates.put(MannedMissionEnum.APOLLO_13, LocalDate.of(1970, Month.APRIL, 11));
        launchDates.put(MannedMissionEnum.APOLLO_14, LocalDate.of(1971, Month.JANUARY, 31));
        launchDates.put(MannedMissionEnum.APOLLO_15, LocalDate.of(1971, Month.JULY, 26));
        launchDates.put(MannedMissionEnum.APOLLO_16, LocalDate.of(1972, Month.APRIL, 16));
        launchDates.put(MannedMissionEnum.APOLLO_17, LocalDate.of(1972, Month.DECEMBER, 7));
    }

    private static void initMannedMissions() {
        for (MannedMissionEnum mission : MannedMissionEnum.values()) {
            missions.put(mission, new MannedMission(mission.getId(), mission.getName(), crew.get(mission), launchDates.get(mission)));
        }
    }

    private MannedMissionData() {
    }
}
