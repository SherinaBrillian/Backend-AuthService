package com.sherina.ship.authservice.contants;

public class QueryConstants {
    
    // Authentication Query
    public final static class Authentication {

        // SAVE DATA
        public static final String SAVE_DATA = "INSERT INTO tbUsers (userUid, fullName, email, userPass, roleUid, phone, statusUid) VALUES (?,?,?,?,?,?,?)";

        // SAVE PROFILE
        public static final String SAVE_PROFILE = "INSERT INTO tbCustomer (customerUid, userUid, createdBy) VALUES (?,?,?)";

        // FIND USER BY EMAIL
        public static final String FIND_USER_BY_EMAIL = "SELECT U.userUid, U.fullName, U.email, U.userPass, U.phone, R.roleUid, R.roleDesc, SR.statusUid AS statusRoleUid, SR.statusDesc AS statusRoleDesc, S.statusUid, S.statusDesc FROM tbUsers U LEFT JOIN tbRole R ON U.roleUid = R.roleUid LEFT JOIN  tbStatus S ON U.statusUid = S.statusUid LEFT JOIN tbStatus SR ON S.statusUid = SR.statusUid WHERE U.email = ? AND LOWER(S.statusDesc) = 'aktif'";
        //"SELECT U.userUid, U.fullName, U.email, U.userPass, U.phone, R.roleUid, R.roleDesc, SR.statusUid AS statusRoleUid, SR.statusDesc AS statusRoleDesc, S.statusUid, S.statusDesc FROM tbUsers U LEFT JOIN tbRole R ON U.roleUid = R.roleUid LEFT JOIN tbStatus S ON U.statusUid = S.statusUid LEFT JOIN tbStatus SR ON R.statusUid = SR.statusUid WHERE U.email = ? AND LOWER(S.statusDesc) = 'aktif'";
        //"SELECT U.userUid, U.fullName, U.email, U.userPass, U.phone, R.roleUid, R.roleDesc, SR.statusUid statusRoleUid, SR.statusDesc statusRoleDesc, S.statusUid, S.statusDesc, C.customerUid FROM tbUsers U LEFT JOIN tbRole R ON U.roleUid = R.roleUid LEFT JOIN tbStatus S ON U.statusUid = S.statusUid LEFT JOIN tbStatus SR ON R.statusUid = SR.statusUid LEFT JOIN tbCustomer C ON U.userUid = C.userUid WHERE U.email = ? AND LOWER(S.statusDesc) = 'aktif'";

        // EXIST USER
        public static final String EXIST_USER = "SELECT COUNT(*) FROM tbUsers WHERE userUid = ?";

        // EXIST USER BY EMAIL
        public static final String EXIST_USER_BY_EMAIL = "SELECT COUNT(*) FROM tbUsers WHERE email = ?";

        // RESET PASSWORD
        public static final String RESET_PASSWORD = "UPDATE tbUsers SET userPass = ? WHERE userUid = ?";

        // SAVE LOGIN HISTORY
        public static final String SAVE_LOGIN_HISTORY = "REPLACE INTO tbLoginAppHistory ( datetimeLogout, userUid, status, device, osDevice, ip, token, version) VALUES (?,?,?,?,?,?,?,?)";
    }
}
