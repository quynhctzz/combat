package service;

import demo.NotFoundException;
import domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import repository.HotelRepository;

import java.util.List;
import java.util.Optional;

public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(Long id) throws NotFoundException {
        return hotelRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Hotel not found"));
    }

    public Hotel createHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public Hotel updateHotel(Long id, Hotel hotel) throws NotFoundException {
        if (!hotelRepository.existsById(id)) {
            throw new NotFoundException("Hotel not found");
        }
        hotel.setId(id);
        return hotelRepository.save(hotel);
    }

    public void deleteHotel(Long id) throws NotFoundException {
        if (!hotelRepository.existsById(id)) {
            throw new NotFoundException("Hotel not found");
        }
        hotelRepository.deleteById(id);
    }
}
