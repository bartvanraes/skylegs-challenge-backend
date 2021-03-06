package com.bartvanraes.skylegschallengebackend.api.v1.mapper;

import com.bartvanraes.skylegschallengebackend.api.v1.model.*;
import com.bartvanraes.skylegschallengebackend.domain.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Mapper
public interface FlightMapper {
    FlightMapper INSTANCE = Mappers.getMapper(FlightMapper.class);

    FlightDTO flightToFlightDTO(Flight flight);
    Flight flightDTOToFlight(FlightDTO flight);
}
