package org.oobootcamp.code_smell.$17_message_chains;

import java.util.List;

public class Community {
    private String name;
    private List<Building> buildings;

    public String getName() {
        return name;
    }

    public List<Building> getBuildings() {
        return buildings;
    }
}
