package ge.lesson.hotel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.poi.hpsf.Decimal;

@Entity
@Getter
@Setter
@Table(schema = "public", name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_seq_generation")
    @SequenceGenerator(name = "room_seq_generation", sequenceName = "room_room_id_seq", allocationSize = 1)
    private Integer roomId;

    @Column(name = "hotel_id")
    private Integer hotelId;

    public enum RoomType { small, medium, large };
    @Enumerated(EnumType.ORDINAL)
    private RoomType roomType;

    @Column(name = "pricepernight")
    private Decimal pricePerNight;

    @Column(name = "pet_friendly")
    private Boolean petFriendly;

    @Column(name = "room_status")
    private Boolean roomStatus;
}
