package com.bartvanraes.skylegschallengebackend.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AirportDTO {
    private String id;
    @JsonProperty("country_id")
    private int countryId;
    private String kind;
    private String icao;
    private String iata;
    private String name;
    private String city;
    @JsonProperty("distance_from_city")
    private String distanceFromCity;
    private int elevation;
    private int longitdude;
    private String timezone;
    private String fuel;
    @JsonProperty("airport_of_entry")
    private String airportOfEntry;
    private Boolean customs;
    @JsonProperty("designated_international")
    private Boolean designatedInternational;
    @JsonProperty("landing_rights")
    private Boolean landingRights;
    @JsonProperty("user_fees")
    private Boolean userFees;
    @JsonProperty("handeling_mandetory")
    private Boolean handelingMandetory;
    @JsonProperty("slots_required")
    private Boolean slotsRequired;
    private String approach;
    private String runways;
    private int length;
    private int width;
    private String label;
    @JsonProperty("country_name")
    private String countryName;
    private Boolean departure;
}
