package ge.lesson.hotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "history_seq_generation")
    @SequenceGenerator(name = "history_seq_generation", sequenceName = "history_history_id_seq", allocationSize = 1)
    private Integer  historyId;

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
}
