package com.xworkz.guardrail.dto;

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
    private String complianceLevel;
    private String nodeCode;
    private String password;
    private String confirmPassword;

}
