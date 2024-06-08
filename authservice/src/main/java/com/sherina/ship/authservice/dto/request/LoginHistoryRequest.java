package com.sherina.ship.authservice.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sherina.ship.authservice.contants.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginHistoryRequest {
     @JsonIgnore
    private String datetimeLogout;

    private String userUid;
    private StatusEnum status;
    private String device;
    private String osDevice;
    private String ip;
    private String token;
    private String version;

    public Object[] toObjectArray() {
        return new Object[] { datetimeLogout, userUid, status.toString(), device, osDevice, ip, token,
                version };
    }
}
