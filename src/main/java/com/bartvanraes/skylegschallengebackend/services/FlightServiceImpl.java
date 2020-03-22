package com.bartvanraes.skylegschallengebackend.services;

import com.bartvanraes.skylegschallengebackend.api.v1.mapper.FlightMapper;
import com.bartvanraes.skylegschallengebackend.api.v1.model.FlightDTO;
import com.bartvanraes.skylegschallengebackend.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private final FlightMapper flightMapper;
    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightMapper flightMapper, FlightRepository flightRepository) {
        this.flightMapper = flightMapper;
        this.flightRepository = flightRepository;
    }

    @Override
    public Flux<FlightDTO> getAllFlights() {
        return flightRepository.findAll()
                .map(flightMapper::flightToFlightDTO);


    }

    @Override
    public Mono<FlightDTO> getFlightById(String id) {
        return flightRepository.findById(id)
                .map(flightMapper::flightToFlightDTO);
    }

    @Override
    public Mono<FlightDTO> getFlightByMissionId(int missionId) {
        return flightRepository.findByMissionId(missionId)
                .map(flightMapper::flightToFlightDTO);
    }
}
