package com.bartvanraes.skylegschallengebackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @Id
    private String Id;
    private int missionId;
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
