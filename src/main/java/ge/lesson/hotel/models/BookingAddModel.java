package ge.lesson.hotel.models;

import java.time.LocalDate;

public record BookingAddModel(Integer guestId, Integer roomId, LocalDate checkInDate,LocalDate checkOutDate,Boolean bookingOff,LocalDate bookingOffDate,Float totalPrice) {
}
