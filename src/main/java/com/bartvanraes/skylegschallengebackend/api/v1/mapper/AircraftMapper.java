package com.bartvanraes.skylegschallengebackend.api.v1.mapper;

import com.bartvanraes.skylegschallengebackend.api.v1.model.AircraftDTO;
import com.bartvanraes.skylegschallengebackend.domain.Aircraft;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AircraftMapper {
    AircraftMapper INSTANCE = Mappers.getMapper(AircraftMapper.class);

    AircraftDTO aircraftToAircraftDTO(Aircraft aircraft);
}
