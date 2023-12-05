package controller;

import demo.NotFoundException;
import domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.HotelService;

import java.util.List;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable Long id) throws NotFoundException {
        return hotelService.getHotelById(id);
    }

    @PostMapping
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.createHotel(hotel);
    }

    @PutMapping("/{id}")
    public Hotel updateHotel(@PathVariable Long id, @RequestBody Hotel hotel) throws NotFoundException {
        return hotelService.updateHotel(id, hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id) throws NotFoundException {
        hotelService.deleteHotel(id);
    }
}
