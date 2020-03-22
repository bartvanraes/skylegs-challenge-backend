package com.bartvanraes.skylegschallengebackend.bootstrap;

import com.bartvanraes.skylegschallengebackend.domain.*;
import com.bartvanraes.skylegschallengebackend.repositories.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Bootstrap implements CommandLineRunner {
    private final FlightRepository flightRepository;

    public Bootstrap(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (flightRepository.count().block() == 0) {
            //load data
            System.out.println("#### LOADING DATA ON BOOTSTRAP #####");

            Airport airportZaventem = Airport.builder().countryId(1).city("Zaventem").name("Brussel National Airport").build();
            Airport airportCharleroi = Airport.builder().countryId(1).city("Charleroi").name("Brussel South Airport").build();

            Aircraft aircraft1 = Aircraft.builder().registration("REG001").build();

            Mission mission1 = Mission.builder().number("123").build();

            User user1 = User.builder().firstName("Bart").lastName("Vanraes").code("BVR").build();

            UserAgenda userAgenda1 = UserAgenda.builder().user(user1).kind("Kind1").pilotFlying(true).pilotInCommand(true).build();

            List<UserAgenda> userAgendas = Arrays.asList(userAgenda1);


            Flight flight1 = Flight.builder().aircraft(aircraft1).departure(airportCharleroi).arrival(airportZaventem).mission(mission1).userAgendas(userAgendas).build();

            flightRepository.save(flight1).block();

            System.out.println("Loaded flights: " + flightRepository.count().block());
        }
    }
}
