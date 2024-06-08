package com.sherina.ship.authservice.model;

import org.springframework.jdbc.core.RowMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {
    private String userUid;
    private String fullName;
    private String email;
    private String userPass;
    private Long phone;
    private Role role;
    private Status status;

    public static RowMapper<UserRole> userRoleRowMapper() {
        return (rs, rowNum) -> {
            // Set User
            String userUid = rs.getString("userUid");
            String fullName = rs.getString("fullName");
            String email = rs.getString("email");
            String userPass = rs.getString("userPass");
            Long phone = rs.getLong("phone");

            // Set Status Role
            Status statusRole = new Status();
            statusRole.setStatusUid(rs.getString("statusRoleUid"));
            statusRole.setStatusDesc(rs.getString("statusRoleDesc"));

            // Set Role
            Role role = new Role();
            role.setRoleUid(rs.getString("roleUid"));
            role.setRoleDesc(rs.getString("roleDesc"));
            role.setStatus(statusRole);

            // Set Status User
            Status status = new Status();
            status.setStatusUid(rs.getString("statusUid"));
            status.setStatusDesc(rs.getString("statusDesc"));

            return new UserRole(userUid, fullName, email, userPass, phone, role, status);
        };
    }
}
