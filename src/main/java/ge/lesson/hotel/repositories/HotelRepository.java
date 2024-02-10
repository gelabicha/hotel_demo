package ge.lesson.hotel.repositories;

import ge.lesson.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {
List<Hotel> findAllByhotelId();
List<Hotel> findByhotelId(Integer hotelId);
}
