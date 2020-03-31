package com.bartvanraes.skylegschallengebackend.api.v1.mapper;

import com.bartvanraes.skylegschallengebackend.api.v1.model.FlightDTO;
import com.bartvanraes.skylegschallengebackend.domain.Aircraft;
import com.bartvanraes.skylegschallengebackend.domain.Flight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightMapperTest {
    public static int NUMBER = 123;
    public static String PROFILE_PICTURE_URL = "http://profile.picture.url";

    FlightMapper flightMapper = FlightMapper.INSTANCE;

    @Test
    public void flightToFlightDTO() throws Exception {
        // given
        Flight flight = new Flight();
        Aircraft aircraft = new Aircraft();
        aircraft.setProfilePictureUrl(PROFILE_PICTURE_URL);
        flight.setNumber(NUMBER);
        flight.setAircraft(aircraft);

        // when
        FlightDTO flightDTO = flightMapper.flightToFlightDTO(flight);

        // then
        assertEquals(NUMBER, flightDTO.getNumber());
        assertEquals(PROFILE_PICTURE_URL, flightDTO.getAircraft().getProfilePictureUrl());
    }
}
