package model;

import domain.Booking;
import domain.Customer;
import domain.Room;
import domain.Staff;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Customer customer() {
        return new Customer();
    }

    @Bean
    public Room room() {
        return new Room();
    }

    @Bean
    public Staff staff() {
        return new Staff();
    }

    @Bean
    public Booking booking() {
        return new Booking();
    }
}

