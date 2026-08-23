package com.xworkz.ecotrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String facilityCode;
    private String orgName;
    private String industryType;
    private double carbonCap;
    private String password;
    private String confirmPassword;
}
