package service;

import domain.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    Room createRoom(Room room);

    Room updateRoom(Long id, Room room);

    Room getRoomById(Long id);

    List<Room> getAllRooms();

    void deleteRoom(Long id);

    Room findAvailableRoom(String roomType, String checkInDate, String checkOutDate);
}


