package com.antoninrgb.labintrojpawithspringlocal.controller;
import com.antoninrgb.labintrojpawithspringlocal.service.FlightService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    FlightService flightService;
    public FlightController(FlightService flightService) {this.flightService = flightService;}

}
