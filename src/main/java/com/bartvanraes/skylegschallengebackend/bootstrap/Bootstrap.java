package com.bartvanraes.skylegschallengebackend.bootstrap;

import com.bartvanraes.skylegschallengebackend.domain.*;
import com.bartvanraes.skylegschallengebackend.repositories.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

@Component
public class Bootstrap implements CommandLineRunner {
    private final FlightRepository flightRepository;

    public Bootstrap(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        flightRepository.deleteAll().block();

        if (flightRepository.count().block() == 0) {
            //load data
            System.out.println("#### LOADING DATA ON BOOTSTRAP #####");

            // FLIGHT 1
            Airport departureAirport1 = Airport
                    .builder()
                    .countryId(1)
                    .iata("BRU")
                    .city("Zaventem")
                    .name("Brussel National Airport")
                    .build();

            Airport arrivalAirport1 = Airport
                    .builder()
                    .countryId(1)
                    .city("Charleroi")
                    .iata("CRL")
                    .name("Brussel South Airport")
                    .build();

            Aircraft aircraft1 = Aircraft.builder().registration("REG001").build();

            Mission mission1 = Mission.builder().id("123").number("123").build();

            User user1 = User.builder().firstName("Bart").lastName("Vanraes").code("BVR").build();

            UserAgenda userAgenda1 = UserAgenda.builder().user(user1).kind("Kind1").pilotFlying(true).pilotInCommand(true).build();

            List<UserAgenda> userAgendas1 = Arrays.asList(userAgenda1);


            Flight flight1 = Flight.builder()
                    .aircraft(aircraft1)
                    .departure(departureAirport1)
                    .arrival(arrivalAirport1)
                    .mission(mission1)
                    .missionId(123)
                    .flightTime("25:30")
                    .tot(new GregorianCalendar(2020, Calendar.MARCH, 20, 9, 28, 0).getTime())
                    .userAgendas(userAgendas1).build();

            flightRepository.save(flight1).block();

            // FLIGHT 2
            Airport departureAirport2 = Airport
                    .builder()
                    .countryId(2)
                    .iata("PRG")
                    .city("Prague")
                    .name("Václav Havel Airport Prague")
                    .build();

            Airport arrivalAirport2 = Airport
                    .builder()
                    .countryId(3)
                    .city("Budapest")
                    .iata("BUD")
                    .name("Budapest Airport")
                    .build();

            Aircraft aircraft2 = Aircraft.builder().registration("REG002").build();

            Mission mission2 = Mission.builder().id("456").number("456").build();

            User user2 = User.builder().firstName("Bart").lastName("Vanraes").code("BVR").build();

            UserAgenda userAgenda2 = UserAgenda.builder().user(user2).kind("Kind1").pilotFlying(true).pilotInCommand(true).build();

            List<UserAgenda> userAgendas2 = Arrays.asList(userAgenda2);


            Flight flight2 = Flight.builder()
                    .aircraft(aircraft2)
                    .departure(departureAirport2)
                    .arrival(arrivalAirport2)
                    .mission(mission2)
                    .missionId(456)
                    .flightTime("1:03:45")
                    .tot(new GregorianCalendar(2020, Calendar.MARCH, 23, 12, 15, 0).getTime())
                    .userAgendas(userAgendas2).build();

            flightRepository.save(flight2).block();

            // FLIGHT 3
            Airport departureAirport3 = Airport
                    .builder()
                    .countryId(4)
                    .iata("RAK")
                    .city("Marrakesh")
                    .name("Marrakesh Menara Airport")
                    .build();

            Airport arrivalAirport3 = Airport
                    .builder()
                    .countryId(5)
                    .city("Istanbul")
                    .iata("IST")
                    .name("Istanbul Airport")
                    .build();

            Aircraft aircraft3 = Aircraft.builder().registration("REG003").build();

            Mission mission3 = Mission.builder().id("789").number("789").build();

            User user3 = User.builder().firstName("Bart").lastName("Vanraes").code("BVR").build();

            UserAgenda userAgenda3 = UserAgenda.builder().user(user3).kind("Kind1").pilotFlying(true).pilotInCommand(true).build();

            List<UserAgenda> userAgendas3 = Arrays.asList(userAgenda3);

            Flight flight3 = Flight.builder()
                    .aircraft(aircraft3)
                    .departure(departureAirport3)
                    .arrival(arrivalAirport3)
                    .mission(mission3)
                    .missionId(789)
                    .flightTime("3:45:40")
                    .tot(new GregorianCalendar(2020, Calendar.MARCH, 25, 16, 28, 0).getTime())
                    .userAgendas(userAgendas3).build();

            flightRepository.save(flight3).block();

            System.out.println("Loaded flights: " + flightRepository.count().block());
        }
    }
}
