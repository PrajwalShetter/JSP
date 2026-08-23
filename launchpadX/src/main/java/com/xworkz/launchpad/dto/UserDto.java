package com.xworkz.launchpad.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    private String username;
    private String repoUrl;
    private String environment;
    private double storageSize;
    private String password;
    private String conPassword;
}
