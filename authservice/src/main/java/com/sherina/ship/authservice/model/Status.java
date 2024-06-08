package com.sherina.ship.authservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Status {
    private String statusUid;
    private String statusDesc;
    private String isActive;
}
