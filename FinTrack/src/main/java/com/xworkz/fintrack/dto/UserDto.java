package com.xworkz.fintrack.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private int id;
    private  String userName;
    private double income;
    private String currency;
    private double saving;
    private String password;
    private String conPassword;
}
