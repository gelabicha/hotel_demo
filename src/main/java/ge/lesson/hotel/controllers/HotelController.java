package ge.lesson.hotel.controllers;

import ge.lesson.hotel.entities.Hotel;
import ge.lesson.hotel.models.HotelAddModel;
import ge.lesson.hotel.services.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class HotelController {
    private final HotelService hotelService;
    @PostMapping("hoteladd")
    public Hotel hotelAdd(@RequestBody HotelAddModel hotelAddModel){
        return hotelService.hotelAdd(hotelAddModel);
    }
    @GetMapping("hotel/{hotelId}")
    public List<Hotel>findByHotelId(@PathVariable Integer hotelId){
        return hotelService.findByHotelId(hotelId);
    }
    @PutMapping("hotelupdate/{hotelId}")
    public ResponseEntity<Hotel> hotelUpdate(@PathVariable Integer hotelId, @RequestBody HotelAddModel hotelAddModel){
        return hotelService.hotelUpdate(hotelId, hotelAddModel);
    }
}
