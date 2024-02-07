package ge.lesson.hotel.entities;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_seq_generation")
    @SequenceGenerator(name = "hotel_seq_generation", sequenceName = "hotel_hotel_id_seq", allocationSize = 1)
    private Integer hotelId;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "hotel_address")
    private String hotelAddress;

    @Column(name = "hotel_phone")
    private String hotelPhone;
}
