package ge.lesson.hotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "guest_seq_generation")
    @SequenceGenerator(name = "guest_seq_generation", sequenceName = "guest_guest_id_seq", allocationSize = 1)
    private Integer guestId;

    @Column(name = "personal_number")
    private String personalNumber;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "dateofbirth")
    private LocalDate dateOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;
}
