package com.xworkz.fleetwire.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    private String licenseNumber;
    private String operatorName;
    private double vehicleCapacity;
    private String zoneCode;
    private String password;
    private String conPassword;
}
