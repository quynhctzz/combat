package service;

import domain.Booking;
import domain.Customer;
import domain.Room;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BookingRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class BookingServiceImpl implements BookingService{
    @Override
    public Booking createBooking(Booking booking) {
        return null;
    }

    @Override
    public Booking updateBooking(Long id, Booking booking) {
        return null;
    }

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private RoomService roomService;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException ("Booking not found"));
    }

    public Booking createBooking(Long customerId, Long roomId, LocalDate checkInDate, LocalDate checkOutDate) {
        Customer customer = customerService.getCustomerById(customerId);
        Room room = roomService.getRoomById(roomId);

        Booking booking = new Booking();
        booking.setCustomer(customer);
        booking.setRoom(room);
        booking.setCheckInDate(Date.valueOf (checkInDate));
        booking.setCheckOutDate(Date.valueOf (checkOutDate));

        return bookingRepository.save(booking);
    }

    public Booking updateBooking(Long id, Long customerId, Long roomId, LocalDate checkInDate, LocalDate checkOutDate) {
        if (!bookingRepository.existsById(id)) {
            throw new EntityNotFoundException("Booking not found");
        }

        Customer customer = customerService.getCustomerById(customerId);
        Room room = roomService.getRoomById(roomId);

        Booking booking = new Booking();
        booking.setId(id);
        booking.setCustomer(customer);
        booking.setRoom(room);
        booking.setCheckInDate(Date.valueOf (checkInDate));
        booking.setCheckOutDate(Date.valueOf (checkOutDate));

        return bookingRepository.save(booking);
    }

    public void deleteBooking(Long id) {
        if (!bookingRepository.existsById(id)) {
            throw new EntityNotFoundException("Booking not found");
        }
        bookingRepository.deleteById(id);
    }
}
