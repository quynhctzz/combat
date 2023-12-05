package service;

import domain.Customer;

import java.util.List;

public interface CustomerService {
    CustomerService createCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customer);

    Customer getCustomerById(Long id);

    List<Customer> getAllCustomers();

    void deleteCustomer(Long id);
}
