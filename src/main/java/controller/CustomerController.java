package controller;

import domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CustomerServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;
    @GetMapping
    private List<Customer> getAllCustomer(){
        return customerService.getAllCustomers ();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }
    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer (customer);

    }
    @PutMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id ){
        customerService.deleteCustomer (id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable Long id) {
        customerService.deleteCustomer (id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
