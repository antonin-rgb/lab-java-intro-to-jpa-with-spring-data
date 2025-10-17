package com.antoninrgb.labintrojpawithspringlocal.service;
import com.antoninrgb.labintrojpawithspringlocal.repository.FlightRepo;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    FlightRepo flightRepo;
    public FlightService(FlightRepo flightRepo) {this.flightRepo = flightRepo;}

}
