package com.antoninrgb.labintrojpawithspringlocal.repository;

import com.antoninrgb.labintrojpawithspringlocal.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

    List<Booking> findByCustomerId(int id);

    List<Booking> findByFlightId(int id);
}
