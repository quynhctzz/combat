package controller;

import domain.Room;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.RoomService;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/{rooms}")
public class RoomController {private final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
        return new ResponseEntity<> (roomService.createRoom(room), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable Long id, @RequestBody Room room) {
        return new ResponseEntity<>(roomService.updateRoom(id, room), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable Long id) {
        return new ResponseEntity<>(roomService.getRoomById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Room>> getAllRooms() {
        return new ResponseEntity<>(roomService.getAllRooms(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
