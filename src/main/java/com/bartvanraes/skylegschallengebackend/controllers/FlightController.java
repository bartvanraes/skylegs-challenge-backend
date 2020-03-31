package com.bartvanraes.skylegschallengebackend.controllers;

import com.bartvanraes.skylegschallengebackend.api.v1.model.FlightDTO;
import com.bartvanraes.skylegschallengebackend.api.v1.model.UpdateRadiationDTO;
import com.bartvanraes.skylegschallengebackend.services.FlightService;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping({"/store-radiation"})
    public Mono<FlightDTO> updateRadiation(@RequestBody UpdateRadiationDTO updateRadiationDTO) {
        return flightService.updateRadiationDose(
                updateRadiationDTO.getFlightMissionId(),
                updateRadiationDTO.getDose());
    }
}
