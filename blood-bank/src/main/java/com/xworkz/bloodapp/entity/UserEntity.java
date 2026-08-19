package com.xworkz.bloodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_table")

public class UserEntity {

    @Column(name = "email_id")
    private String email;
    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "bloodGroup")
    private String bloodGroup;
    @Column(name = "userId")
    private String userId;

    @Column(name = "password")
    private String password;

    @Column(name = "repeatPassword")
    private String repeatPassword;
}
