package com.bartvanraes.skylegschallengebackend.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AircraftVariantDTO {
    private String id;
    private String manufacturer;
    private String icao;
    private String model;
    private int mtow;
    private String label;
    private int range;
    @JsonProperty("cruise_speed")
    private int cruiseSpeed;
    @JsonProperty("max_seats")
    private int maxSeats;
    @JsonProperty("logo_picture_url")
    private String logoPictureUrl;
}
