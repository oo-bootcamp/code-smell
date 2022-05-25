package org.oobootcamp.code_smell.$17_message_chains;


import java.util.List;

public class Room {
    private String roomNo;
    private float square;
    private List<Person> persons;

    public String getRoomNo() {
        return roomNo;
    }

    public float getSquare() {
        return square;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
