package com.antoninrgb.labintrojpawithspringlocal.service;
import com.antoninrgb.labintrojpawithspringlocal.model.Booking;
import com.antoninrgb.labintrojpawithspringlocal.repository.BookingRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    BookingRepo bookingRepo;
    public BookingService(BookingRepo bookingRepo) {this.bookingRepo = bookingRepo;}

    public List<Booking> findByCustomerId(int id) {
        return bookingRepo.findByCustomerId(id);
    }

    public List<Booking> findByFlightId(int id) {
        return bookingRepo.findByFlightId(id);
    }

}
