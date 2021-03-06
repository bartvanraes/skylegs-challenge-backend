package com.bartvanraes.skylegschallengebackend.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aircraft {
    @Id
    private String id;
    private String registration;
    private String phone;
    private String label;
    private String profilePictureUrl;
    private AircraftVariant variant;

    /*
    id: number;
        registration: string;
        phone: string;
        label: string;
        large_picture_url: string;
        profile_picture_url: string;
        variant: {
            id: number;
            manufacturer: string;
            icao: string;
            model: string;
            mtow: number;
            label: string;
            range: number;
            cruise_speed: number;
            max_seats: number;
            logo_picture_url: string;
        }
     */
}
