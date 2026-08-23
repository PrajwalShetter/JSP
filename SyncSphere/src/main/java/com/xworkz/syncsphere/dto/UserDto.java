package com.xworkz.syncsphere.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    private String email;
    private String teamName;
    private double maxMembers;
    private String securityLevel;
    private String password;
    private String conPassword;
}
