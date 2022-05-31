package nl.isaac.devblog.apollomissions.api.model;

public enum MannedMissionEnum {
    APOLLO_1(1, "Apollo 1"),
    APOLLO_7(7, "Apollo 7"),
    APOLLO_8(8, "Apollo 8"),
    APOLLO_9(9, "Apollo 9"),
    APOLLO_10(10, "Apollo 10"),
    APOLLO_11(11, "Apollo 11"),
    APOLLO_12(12, "Apollo 12"),
    APOLLO_13(13, "Apollo 13"),
    APOLLO_14(14, "Apollo 14"),
    APOLLO_15(15, "Apollo 15"),
    APOLLO_16(16, "Apollo 16"),
    APOLLO_17(17, "Apollo 17");

    private final Integer id;
    private final String name;

    MannedMissionEnum(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static MannedMissionEnum from(final Integer id) {
        for (MannedMissionEnum mission : values()) {
            if (mission.getId().equals(id)) {
                return mission;
            }
        }
        return null;
    }
}
