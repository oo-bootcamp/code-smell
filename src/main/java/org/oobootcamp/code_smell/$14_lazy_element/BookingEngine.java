package org.oobootcamp.code_smell.$14_lazy_element;

import org.oobootcamp.code_smell.$14_lazy_element.model.Hotel;
import org.oobootcamp.code_smell.$14_lazy_element.model.Reservation;
import org.oobootcamp.code_smell.$14_lazy_element.model.Room;
import org.oobootcamp.code_smell.$14_lazy_element.util.DateUtil;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.IntStream;

public class BookingEngine {
    private List<Hotel> hotels;

    public BookingEngine(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public boolean hasRoom(Date date, int days, int roomType) {
        return findRoomOptional(date, days, roomType).isPresent();
    }

    public Reservation bookRoom(String customerName, String email, Date from, int bookingDays, int roomType) {
        Optional<Room> roomOptional = findRoomOptional(from, bookingDays, roomType);
        if (roomOptional.isPresent()) {
            return new Reservation(UUID.randomUUID().toString(), customerName, email, from, bookingDays, roomOptional.get());
        }

        return null;
    }

    private Optional<Room> findRoomOptional(Date date, int days, int roomType) {
        return hotels.stream()
                .flatMap(hotel -> hotel.getRooms().stream())
                .filter(room -> room.getRoomType().getType() == roomType)
                .filter(room ->
                        IntStream.of(days).allMatch(day ->
                                new RoomChecker().isRoomBooked(room, DateUtil.getDateAfter(date, day - 1))))
                .findAny();
    }

}
