package com.bartvanraes.skylegschallengebackend.controllers;

import com.bartvanraes.skylegschallengebackend.api.v1.model.FlightDTO;
import com.bartvanraes.skylegschallengebackend.services.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/flights")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping({"/", ""})
    public Flux<FlightDTO> list() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Mono<FlightDTO> getById(@PathVariable String id) {
        return flightService.getFlightById(id);
    }
}
