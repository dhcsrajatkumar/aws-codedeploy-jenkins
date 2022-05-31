package nl.isaac.devblog.apollomissions.api.data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MannedMissionDataTest {
    @Test
    public void testContainsTwelveMannedMissions() {
        assertEquals(12, MannedMissionData.missions.size());
    }
}