package com.bartvanraes.skylegschallengebackend.repositories;

import com.bartvanraes.skylegschallengebackend.domain.Flight;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface FlightRepository extends ReactiveMongoRepository<Flight, String> {
    Mono<Flight> findByMissionId(int missionId);
}
