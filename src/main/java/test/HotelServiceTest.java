package test;

import demo.NotFoundException;
import domain.Hotel;
import jakarta.persistence.EntityNotFoundException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;
import repository.HotelRepository;
import service.HotelService;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertThrows;
import static org.testng.AssertJUnit.assertEquals;

@SpringBootTest
public class HotelServiceTest {
    @Mock
    @Autowired
    private HotelRepository hotelRepository;

    @InjectMocks
    private HotelService hotelService;

    @Test
    public void testUpdateHotelSuccess() throws NotFoundException {
        Long hotelId = 1L;
        Hotel existingHotel = new Hotel();
        existingHotel.setId(hotelId);
        existingHotel.setName("Old Hotel");

        Hotel updatedHotel = new Hotel();
        updatedHotel.setId(hotelId);
        updatedHotel.setName("New Hotel");


        when(hotelRepository.existsById(hotelId)).thenReturn(true);
        when(hotelRepository.save(updatedHotel)).thenReturn(updatedHotel);


        Hotel result = hotelService.updateHotel(hotelId, updatedHotel);


        assertEquals(updatedHotel, result);
    }

    @Test
    public void testUpdateHotelNotFound() {
        Long hotelId = 1L;
        Hotel updatedHotel = new Hotel();
        updatedHotel.setId(hotelId);
        updatedHotel.setName("New Hotel");


        when(hotelRepository.existsById(hotelId)).thenReturn(false);


        assertThrows(EntityNotFoundException.class, () -> hotelService.updateHotel(hotelId, updatedHotel));
    }
}
