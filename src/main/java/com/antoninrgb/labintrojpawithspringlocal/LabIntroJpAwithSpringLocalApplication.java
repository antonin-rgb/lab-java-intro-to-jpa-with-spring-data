package com.antoninrgb.labintrojpawithspringlocal;

import com.antoninrgb.labintrojpawithspringlocal.model.Booking;
import com.antoninrgb.labintrojpawithspringlocal.model.Customer;
import com.antoninrgb.labintrojpawithspringlocal.model.CustomerStatus;
import com.antoninrgb.labintrojpawithspringlocal.model.Flight;
import com.antoninrgb.labintrojpawithspringlocal.repository.BookingRepo;
import com.antoninrgb.labintrojpawithspringlocal.repository.CustomerRepo;
import com.antoninrgb.labintrojpawithspringlocal.repository.FlightRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabIntroJpAwithSpringLocalApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabIntroJpAwithSpringLocalApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepo customerRepo,
                          FlightRepo flightRepo,
                          BookingRepo bookingRepo) {
        return args -> {
            Customer alice = customerRepo.save(new Customer("Alice", CustomerStatus.SILVER, 70000));
            Customer zatanna = customerRepo.save(new Customer("Zatanna", CustomerStatus.GOLD, 120000));
            Flight flight = flightRepo.save(new Flight("AB123", "Boeing 747", 300, 400));
            bookingRepo.save(new Booking(alice.getId(), flight.getId()));
            bookingRepo.save(new Booking(zatanna.getId(), flight.getId()));
        };
    }

}
