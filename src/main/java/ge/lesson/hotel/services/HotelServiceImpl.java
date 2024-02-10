package ge.lesson.hotel.services;

import ge.lesson.hotel.entities.Hotel;
import ge.lesson.hotel.models.HotelAddModel;
import ge.lesson.hotel.repositories.HotelRepository;
import lombok.AllArgsConstructor;
import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;
    @Override
    public Hotel hotelAdd(HotelAddModel hotelAddModel) {
        Hotel hotel = new Hotel();
        hotel.setHotelName(hotelAddModel.hotelName());
        hotel.setHotelName(hotelAddModel.hotelAddress());
        hotel.setHotelPhone(hotelAddModel.hotelPhone());
        hotelRepository.save(hotel);
        return hotel;
    }

    @Override
    public List<Hotel> findByHotelId(Integer hotelId) {
        List<Hotel> findByHotelId = hotelRepository.findAllByhotelId();
        return findByHotelId;
    }

    @Override
    public ResponseEntity<Hotel> hotelUpdate(Integer hotelId, HotelAddModel hotelAddModel) {
            Hotel hotelUpdate = hotelRepository.findById(hotelId)
                            .orElseThrow(() -> new ResourceNotFoundException("hotel not found for this id"));
            hotelUpdate.setHotelName(hotelAddModel.hotelName());
            hotelUpdate.setHotelAddress(hotelUpdate.getHotelAddress());
            hotelUpdate.setHotelPhone(hotelAddModel.hotelPhone());
            hotelRepository.save(hotelUpdate);

            return ResponseEntity.ok(hotelUpdate);

    }
}
