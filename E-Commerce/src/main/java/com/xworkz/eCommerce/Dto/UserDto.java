package com.xworkz.eCommerce.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private int id;
    private String username;
    private String email;
    private String number;
    private String address;
    private String password;
    private String conPassword;
}
