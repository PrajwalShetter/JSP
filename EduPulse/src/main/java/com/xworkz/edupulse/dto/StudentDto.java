package com.xworkz.edupulse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDto {

    private int id;
    private String rollNumber;
    private String studentName;
    private String email;
    private String semester;
    private String password;
    private String conPassword;
}
