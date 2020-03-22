package com.bartvanraes.skylegschallengebackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Airport {
    @Id
    private String id;
    private int countryId;
    private String name;
    private String city;

    /*
    id: number;
        country_id: number;
        kind: string;
        icao: string;
        iata: string;
        name: string;
        city: string;
        distance_from_city: string;
        elevation: number;
        longitude: number;
        latitude: number;
        timezone: string;
        fuel: string;
        airport_of_entry: string;
        customs: boolean;
        designated_international: boolean;  // number?
        landing_rights: boolean;            // number?
        user_fees: boolean;                 // number?
        handling_mandatory: boolean;        // number?
        slots_required: boolean;            // number?
        approach: string;
        runways: string;
        length: number;
        width: number;
        label: string;
        country_name: string;
        departure: boolean;
     */
}
