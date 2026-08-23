package com.xworkz.taskapp.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    private String userId;
    private String fullName;
    private String email;
    private String workspaceCode;
    private String password;
    private String confirmPassword;
}
