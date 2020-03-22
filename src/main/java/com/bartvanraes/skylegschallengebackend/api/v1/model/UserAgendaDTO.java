package com.bartvanraes.skylegschallengebackend.api.v1.model;

import com.bartvanraes.skylegschallengebackend.domain.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserAgendaDTO {
    private String id;
    private String kind;
    @JsonProperty("pilot_in_command")
    private Boolean pilotInCommand;
    @JsonProperty("pilot_flying")
    private Boolean pilotFlying;
    private UserDTO user;
}
