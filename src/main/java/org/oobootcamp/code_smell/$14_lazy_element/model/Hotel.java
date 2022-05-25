package org.oobootcamp.code_smell.$14_lazy_element.model;

import java.util.List;

public class Hotel {
    private String name;
    private List<Room> rooms;

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
