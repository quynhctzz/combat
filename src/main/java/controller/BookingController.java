package controller;

import domain.Booking;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        return new ResponseEntity<> (bookingService.createBooking(booking), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Booking> updateBooking(@PathVariable Long id, @RequestBody Booking booking) {
        return new ResponseEntity<>(bookingService.updateBooking(id, booking), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
        return new ResponseEntity<>(bookingService.getBookingById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings() {
        return new ResponseEntity<>(bookingService.getAllBookings(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

