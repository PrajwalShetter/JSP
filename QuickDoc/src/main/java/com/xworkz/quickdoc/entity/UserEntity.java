package com.xworkz.quickdoc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "doctor_profiles")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "license_number")
    private String licenseNumber;

    @Column(name = "doctor_name")
    private String doctorName;

    @Column(name = "experience_years")
    private double experienceYears;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String conPassword;
}
