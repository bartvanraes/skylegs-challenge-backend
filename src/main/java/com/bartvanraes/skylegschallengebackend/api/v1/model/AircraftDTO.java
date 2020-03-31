package com.bartvanraes.skylegschallengebackend.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AircraftDTO {
    private String id;
    private String registration;
    private String phone;
    private String label;
    @JsonProperty("profile_picture_url")
    private String profilePictureUrl;
}
