package com.xworkz.ecotrack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
@Entity

public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "facilityCode")
    private String facilityCode;
    @Column(name = "orgname")
    private String orgName;

    @Column(name = "industryType")
    private String industryType;
    @Column(name = "carbonCap")
    private double carbonCap;
    @Column(name = "password")
    private String password;
    @Column(name = "ConfirmPassword")
    private String confirmPassword;
}
