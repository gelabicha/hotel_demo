package ge.lesson.hotel.services;

import ge.lesson.hotel.entities.Hotel;
import ge.lesson.hotel.models.HotelAddModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    Hotel hotelAdd(HotelAddModel hotelAddModel);

    List<Hotel> findByHotelId(Integer hotelId);

    ResponseEntity<Hotel> hotelUpdate(Integer hotelId, HotelAddModel hotelAddModel);
}
