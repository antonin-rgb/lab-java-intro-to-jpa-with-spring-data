package com.antoninrgb.labintrojpawithspringlocal.repository;

import com.antoninrgb.labintrojpawithspringlocal.model.Customer;
import com.antoninrgb.labintrojpawithspringlocal.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Integer> {
}
