package com.bartvanraes.skylegschallengebackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @Id
    private String id;
    private int missionId;
    private String blockTime;
    private String flightTime;
    private String actualBlockTime;
    private String actualFlightTime;
    private int pax;
    private String crewString;
    private Boolean emptyLeg;
    private Boolean sharedLeg;
    private String clientPdfUrl;
    private String blockFuel;
    private String actualFuelUpliftBefore;
    private String actualFuelStart;
    private String actualFuelEnd;
    private String actualFuelUplift;
    private String hash;
    private int number;
    private double radiationDose;

    private Date obt;
    private Date tot;
    private Date ldt;
    private Date actualObt;
    private Date actualTot;
    private Date actualLdt;
    private Date actualIbt;
    private Date updatedAt;
    private Date createdAt;
    private Date date;

    private Aircraft aircraft;
    private Mission mission;
    private Airport departure;
    private Airport arrival;
    private List<UserAgenda> userAgendas;

    /*
    id: number;
        mission_id: number;
        block_time: string;
        flight_time: string;
        actual_block_time: string;
        actual_flight_time: string;
        pax: number;
        crew_string: string;
        empty_leg: boolean;
        shared_leg: boolean;
        client_pdf_url: string;
        block_fuel: string;                 // any?
        actual_fuel_uplift_before: string;  // any?
        actual_fuel_start: string;
        actual_fuel_end: string;
        actual_fuel_uplift: string;         // any?
        hash: string;
        remarks: string;                    // any?
        number: number;                     // any?
        obt: Date;
        tot: Date;
        ldt: Date;
        ibt: Date;
        actual_obt: Date;
        actual_tot: Date;
        actual_ldt: Date;
        actual_ibt: Date;
        updated_at: Date;                   // any?
        created_at: Date;
        date: Date; // no time
        aircraft: IAircraft;
        mission: IMission;
        departure: IAirport;
        arrival: IAirport;
        userAgendas: Array<IUserAgenda>;
     */
}
