package com.sherina.ship.authservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ship {
    private String shipUid;
    private String shipDesc;
    private String status;
    private String capacity;
    private String createdAt;
    private String updatedAt;
}
