package ge.lesson.hotel.services;

import ge.lesson.hotel.entities.Booking;
import ge.lesson.hotel.models.BookingAddModel;
import ge.lesson.hotel.repositories.BookingRepository;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookingServiceImpl implements BookingService {
    private final BookingRepository bookingRepository;
    @Override
    public Booking bookingAdd(BookingAddModel bookingAddModel) {
        Booking booking = new Booking();
        booking.setGuestId(bookingAddModel.guestId());
        booking.setRoomId(bookingAddModel.roomId());
        booking.setCheckInDate(bookingAddModel.checkInDate());
        booking.setCheckOutDate(bookingAddModel.checkOutDate());
        booking.setBookingOff(bookingAddModel.bookingOff());
        booking.setBookingOffDate(bookingAddModel.bookingOffDate());
        bookingRepository.save(booking);
        return booking;
    }

    @Override
    public List<Booking> findByBookingId(Integer bookingId) {
        List<Booking> findByBookingId = bookingRepository.findAllById(bookingId);
        return findByBookingId;

    }
    /*
       მოვძებნო ოთახის იდ-ით;
       ვნახოთ ეს ოთახი დაკავებული არის თუ არა მითითებულ თარიღში
       თუ დაკავებულია დავაბრუნოთ "დაკავებულია"
       თუ არა და გავაკეთოთ ჯავშანი;
        */
    @SneakyThrows
    @Override
    public Booking newBooking(BookingAddModel bookingAddModel) {
        List<Booking> bookings = bookingRepository.findAllByRoomId(bookingAddModel.roomId());

        for(Booking booking : bookings) {
            if (((booking.getCheckInDate() <= bookingAddModel.checkInDate()) && (booking.getCheckOutDate() >= bookingAddModel.checkInDate())) ||
                    ((booking.getCheckInDate() <= bookingAddModel.checkOutDate()) && (booking.getCheckOutDate() >= bookingAddModel.checkOutDate())) ||
                    (booking.getBookingOff() == true)) {
                throw new Exception("you cannt done booking");
            } else {
            Booking newBooking1 = new Booking();
            newBooking1.setGuestId(bookingAddModel.guestId());
            newBooking1.setRoomId(bookingAddModel.roomId());
            newBooking1.setCheckInDate(bookingAddModel.checkInDate());
            newBooking1.setCheckOutDate(bookingAddModel.checkOutDate());
            newBooking1.setTotalPrice(bookingAddModel.totalPrice());
            bookingRepository.save(newBooking1);
            return newBooking1;
            }
        }
        }




    }

