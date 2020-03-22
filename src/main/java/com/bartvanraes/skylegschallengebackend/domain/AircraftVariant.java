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
public class AircraftVariant {
    @Id
    private String id;
    private String manufacturer;
    private String icao;
    private String model;
    private int mtow;
    private String label;
    private int range;
    private int cruiseSpeed;
    private int maxSeats;
    private String logoPictureUrl;
}
