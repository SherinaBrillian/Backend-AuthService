package com.sherina.ship.authservice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
    private String fullName;
    private String email;
    private String password;
    private String roleUid;
    private Long phone;
    private String statusUid;  
}
