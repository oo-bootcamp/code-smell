package org.oobootcamp.code_smell.$14_lazy_element.model;

import java.util.Date;

public class Reservation {
    private String id;
    private String customerName;
    private String email;
    private Date from;
    private int bookingDays;
    private Room room;

    public Reservation(String id, String customerName, String email, Date from, int bookingDays, Room room) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.from = from;
        this.bookingDays = bookingDays;
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public Date getFrom() {
        return from;
    }

    public int getBookingDays() {
        return bookingDays;
    }

    public Room getRoom() {
        return room;
    }
}
