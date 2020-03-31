package com.bartvanraes.skylegschallengebackend.api.v1.mapper;

import com.bartvanraes.skylegschallengebackend.api.v1.model.AircraftDTO;
import com.bartvanraes.skylegschallengebackend.api.v1.model.AircraftVariantDTO;
import com.bartvanraes.skylegschallengebackend.domain.Aircraft;
import com.bartvanraes.skylegschallengebackend.domain.AircraftVariant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AircraftVariantMapper {
    AircraftVariantMapper INSTANCE = Mappers.getMapper(AircraftVariantMapper.class);

    AircraftVariantDTO aircraftVariantToAircraftVariantDTO(AircraftVariant aircraftVariant);
    AircraftVariant aircraftVariantDTOToAircraftVariant(AircraftVariantDTO aircraftVariant);
}
