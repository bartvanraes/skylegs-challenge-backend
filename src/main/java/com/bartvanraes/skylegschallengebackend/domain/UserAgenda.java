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
public class UserAgenda {
    @Id
    private String id;
    private String kind;
    private Boolean pilotInCommand;
    private Boolean pilotFlying;
    private User user;

    /*
    id: number;
        kind: string;
        pilot_in_command: boolean;
        pilot_flying: boolean;
        user: {
            id: number;
            code: string;
            first_name: string;
            last_name: string;
            phone: string;
        }
     */
}
