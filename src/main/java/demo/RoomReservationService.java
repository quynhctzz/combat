package demo;

import model.RoomReservationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;
import repository.RoomRepository;

@Service
public class RoomReservationService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public RoomReservationResponse bookRoom(RoomReservationRequest request){
        // Implement logic for searching available rooms

        // Implement logic for booking the room

        // Return response with room reservation details
        return null;
    }
}
