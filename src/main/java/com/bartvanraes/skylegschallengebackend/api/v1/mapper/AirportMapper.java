package com.bartvanraes.skylegschallengebackend.api.v1.mapper;

import com.bartvanraes.skylegschallengebackend.api.v1.model.AirportDTO;
import com.bartvanraes.skylegschallengebackend.domain.Airport;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AirportMapper {
    AirportMapper INSTANCE = Mappers.getMapper(AirportMapper.class);

    AirportDTO airportToAirportDTO(Airport airport);
    Airport airportDTOToAirport(AirportDTO airport);
}
