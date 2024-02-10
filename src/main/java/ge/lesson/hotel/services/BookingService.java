package ge.lesson.hotel.services;

import ge.lesson.hotel.entities.Booking;
import ge.lesson.hotel.models.BookingAddModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingService {
    Booking bookingAdd(BookingAddModel bookingAddModel);

    List<Booking> findByBookingId(Integer bookingId);

    Booking newBooking(BookingAddModel bookingAddModel);
}
