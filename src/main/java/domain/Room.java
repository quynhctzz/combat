package domain;

import jakarta.persistence.*;
import model.RoomType;

@Entity
@Table(name = "rooms")
public class Room {

    @Id
    @Column(name = "room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "room_name")
    private String name;


    @Column(name = "room_type")
    private RoomType roomType;

    @Column(name = "price ")
    private int price;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "capacity")
    private int capacity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }
}

