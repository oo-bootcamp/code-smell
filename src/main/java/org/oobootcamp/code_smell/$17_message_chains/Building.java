package org.oobootcamp.code_smell.$17_message_chains;

import java.util.List;

public class Building {
    private String buildingNo;
    private Person buildingManager;
    private List<Room> rooms;

    public String getBuildingNo() {
        return buildingNo;
    }

    public Person getBuildingManager() {
        return buildingManager;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
