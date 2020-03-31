package com.bartvanraes.skylegschallengebackend.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateRadiationDTO {
    /*@JsonProperty("FlightLog")
    private String flightLog;
    @JsonProperty("ACFTAIL")
    private String acftail;
    @JsonProperty("DEP")
    private String dep;
    @JsonProperty("DEST")
    private String dest;
    @JsonProperty("STD")
    private Date std;
    @JsonProperty("STA")
    private Date sta;
    @JsonProperty("ATCID")
    private String atcid;*/
    @JsonProperty("FlightMissionId") // Let's assume this is how we can identify flights
    private int flightMissionId;
    @JsonProperty("Dose")
    private double dose;
    /*@JsonProperty("Certificate")
    private String certificate;*/
}
