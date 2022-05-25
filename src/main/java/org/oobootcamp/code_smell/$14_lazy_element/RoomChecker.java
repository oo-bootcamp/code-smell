package org.oobootcamp.code_smell.$14_lazy_element;

import org.oobootcamp.code_smell.$14_lazy_element.model.Room;

import java.util.Date;

public class RoomChecker {
    public Boolean isRoomBooked(Room room, Date date) {
        return room.getBookingStatus().get(date);
    }
}
