package com.xworkz.fintrack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_table")
@Entity
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private  String userName;

    @Column(name = "income")
    private double income;

    @Column(name = "currency")
    private String currency;

    @Column(name = "monthly_saving")
    private double saving;

    @Column(name = "password")
    private String password;
    @Column(name = "confirm_password")
    private String conPassword;
}
