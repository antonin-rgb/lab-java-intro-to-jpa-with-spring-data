package com.antoninrgb.labintrojpawithspringlocal.controller;
import com.antoninrgb.labintrojpawithspringlocal.model.Booking;
import com.antoninrgb.labintrojpawithspringlocal.service.BookingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    BookingService bookingService;
    public BookingController(BookingService bookingService) {this.bookingService = bookingService;}

    @GetMapping("/customer/{id}")
    public List<Booking> getByCustomerId(@PathVariable int id) {
        return bookingService.findByCustomerId(id);
    }

    @GetMapping("/flight/{id}")
    public List<Booking> getByFlightId(@PathVariable int id) {
        return bookingService.findByFlightId(id);
    }

}
