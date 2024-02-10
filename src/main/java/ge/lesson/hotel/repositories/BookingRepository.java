package ge.lesson.hotel.repositories;

import ge.lesson.hotel.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {

    List<Booking> findAllById(Integer bookingId);

    List<Booking> findAllByRoomId(Integer integer);
}
