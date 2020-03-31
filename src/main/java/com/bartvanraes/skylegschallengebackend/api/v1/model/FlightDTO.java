package com.bartvanraes.skylegschallengebackend.api.v1.model;

import com.bartvanraes.skylegschallengebackend.domain.Aircraft;
import com.bartvanraes.skylegschallengebackend.domain.Airport;
import com.bartvanraes.skylegschallengebackend.domain.Mission;
import com.bartvanraes.skylegschallengebackend.domain.UserAgenda;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FlightDTO {
    private String id;
    @JsonProperty("mission_id")
    private int missionId;
    @JsonProperty("block_time")
    private String blockTime;
    @JsonProperty("flight_time")
    private String flightTime;
    @JsonProperty("actual_block_time")
    private String actualBlockTime;
    @JsonProperty("actual_flight_time")
    private String actualFlightTime;
    private int pax;
    @JsonProperty("crew_string")
    private String crewString;
    @JsonProperty("empty_leg")
    private Boolean emptyLeg;
    @JsonProperty("shared_leg")
    private Boolean sharedLeg;
    @JsonProperty("client_pdf_url")
    private String clientPdfUrl;
    @JsonProperty("block_fuel")
    private String blockFuel;
    @JsonProperty("acutal_fuel_uplift_before")
    private String actualFuelUpliftBefore;
    @JsonProperty("actual_fuel_start")
    private String actualFuelStart;
    @JsonProperty("actual_fuel_end")
    private String actualFuelEnd;
    @JsonProperty("actual_fuel_uplift")
    private String actualFuelUplift;
    private String hash;
    private int number;

    private Date obt;
    private Date tot;
    private Date ldt;
    @JsonProperty("actual_obt")
    private Date actualObt;
    @JsonProperty("actual_tot")
    private Date actualTot;
    @JsonProperty("actual_ldt")
    private Date actualLdt;
    @JsonProperty("actual_ibt")
    private Date actualIbt;
    @JsonProperty("update_at")
    private Date updatedAt;
    @JsonProperty("create_at")
    private Date createdAt;
    private Date date;

    private AircraftDTO aircraft;
    private MissionDTO mission;
    private AirportDTO departure;
    private AirportDTO arrival;
    @JsonProperty("user_agendas")
    private List<UserAgendaDTO> userAgendas;

}
