package com.xworkz.quickdoc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    private String licenseNumber;
    private String doctorName;
    private double experienceYears;
    private String specialty;
    private String password;
    private String conPassword;
}
