package com.bartvanraes.skylegschallengebackend.services;



import com.bartvanraes.skylegschallengebackend.api.v1.model.FlightDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.List;

public interface FlightService {
    Flux<FlightDTO> getAllFlights();
    Mono<FlightDTO> getFlightById(String id);
    Mono<FlightDTO> getFlightByMissionId(int missionId);
    Mono<FlightDTO> updateRadiationDose(int missionId, double dose);

}
