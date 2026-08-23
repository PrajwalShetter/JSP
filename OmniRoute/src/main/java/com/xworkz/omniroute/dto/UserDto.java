package com.xworkz.omniroute.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private  int id;
    private String dispatcherId;
    private String hubName;
    private double operatingRadius;
    private String fleetType;
    private String password;
    private String conPassword;
}
