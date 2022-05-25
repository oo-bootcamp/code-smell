package org.oobootcamp.code_smell.$14_lazy_element.model;

import java.util.Date;
import java.util.Map;

public class Room {
    private RoomType roomType;
    private String roomNo;
    private int adultLimit;
    private int childLimit;
    private Map<Date, Boolean> bookingStatus;

    public RoomType getRoomType() {
        return roomType;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public int getAdultLimit() {
        return adultLimit;
    }

    public int getChildLimit() {
        return childLimit;
    }

    public Map<Date, Boolean> getBookingStatus() {
        return bookingStatus;
    }
}
