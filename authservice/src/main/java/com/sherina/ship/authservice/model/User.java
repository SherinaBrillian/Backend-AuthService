package com.sherina.ship.authservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String userUid;
    private String fullName;
    private String email;
    private String userPass;
    private String roleUid;
    private Long phone;
    private String statusUid;
}
