package ge.lesson.hotel.controllers;

import ge.lesson.hotel.entities.Booking;
import ge.lesson.hotel.models.BookingAddModel;
import ge.lesson.hotel.services.BookingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class BookingController {
    public final BookingService bookingService;
    @PostMapping("booking")
    public Booking bookingAdd(@RequestBody BookingAddModel bookingAddModel){
        return bookingService.bookingAdd(bookingAddModel);
    }

    @GetMapping("booking/{bookingId}")
    public List<Booking> findByBookingId(@PathVariable Integer bookingId){
        return bookingService.findByBookingId(bookingId);
    };
    /*
    მოვძებნო ოთახის იდ-ით;
    ვნახოთ ეს ოთახი დაკავებული არის თუ არა მითითებულ თარიღში
    თუ დაკავებულია დავაბრუნოთ "დაკავებულია"
    თუ არა და გავაკეთოთ ჯავშანი;
     */
    @PostMapping("booking/new")
    public Booking newBooking(@RequestBody BookingAddModel bookingAddModel){
        return bookingService.newBooking(bookingAddModel);
    }
}
