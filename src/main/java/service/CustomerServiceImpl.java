package service;

import domain.Customer;
import domain.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CustomerRepository;

import java.util.List;
import java.util.Map;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public CustomerService createCustomer(Customer customer){
        validateCustomer(customer);
        return null;

    }

    @Override
    public Customer updateCustomer(Long id, Customer customer) {
        return null;
    }


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public void deleteCustomer(Long id){
        customerRepository.deleteById(id);
    }
    private void validateCustomer(Customer customer){
        if (customer.getName () == null || customer.getName ().isEmpty ()){
            throw new IllegalArgumentException ("Customer name is required");

        }
        if (customer.getEmail () == null || customer.getEmail ().isEmpty ()){
            throw new IllegalArgumentException ("Customer email is required");
        }

    }
    public void regiserRoom (String roomType, String checkInDate, String checkOutDate, Map<String, String> customerInfo) {
        // Call the RoomService to find an available room based on the provided parameters
        RoomService roomService = new RoomService () {
            @Override
            public Room createRoom(Room room) {
                return null;
            }

            @Override
            public Room updateRoom(Long id, Room room) {
                return null;
            }

            @Override
            public Room getRoomById(Long id) {
                return null;
            }

            @Override
            public List<Room> getAllRooms() {
                return null;
            }

            @Override
            public void deleteRoom(Long id) {

            }

            @Override
            public Room findAvailableRoom(String roomType, String checkInDate, String checkOutDate) {
                return null;
            }
        };
        Room selectedRoom = roomService.findAvailableRoom(roomType, checkInDate, checkOutDate);

        // Save the customer information and room reservation details to the database
        // This step can be replaced with actual database queries using an ORM like Hibernate or a query builder like JPA Criteria API
        saveCustomerInfoInDatabase(selectedRoom, customerInfo);
    }

    private void saveCustomerInfoInDatabase(Room selectedRoom, Map<String, String> customerInfo) {
    }


    public Customer getCustomerById(Long id) {
        return null;
    }

    public Customer addCustomer(Customer customer) {
        return null;
    }
}
