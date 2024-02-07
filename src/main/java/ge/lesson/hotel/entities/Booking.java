package ge.lesson.hotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "booking_seq_generation")
    @SequenceGenerator(name = "booking_seq_generation", sequenceName = "booking_booking_id_seq", allocationSize = 1)
    private Integer  bookingId;

    @Column(name = "guest_id")
    private Integer guestId;

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "checkinDate")
    private LocalDate checkInDate;

    @Column(name = "checkoutDate")
    private LocalDate checkOutDate;

    @Column(name = "bookingOff")
    private Boolean bookingOff;

    @Column(name = "bookingOffDate")
    private LocalDate bookingOffDate;

    @Column(name = "totalPrice")
    private Integer totalPrice;
}
