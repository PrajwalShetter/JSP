package com.xworkz.apexLog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private  int id;
    private String userName;
    private String email;
    private String gender;
    private String accountType;
    private String password;
    private String confirmPassword;
}
