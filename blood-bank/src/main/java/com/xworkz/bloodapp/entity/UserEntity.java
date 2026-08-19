package com.xworkz.bloodapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id; // <-- ADD THIS IMPORT
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_table")
public class UserEntity {

    @Id // <-- ADD THIS: Marks this specific field as your Table Primary Key
    @Column(name = "userId")
    private String userId;

    @Column(name = "email_id")
    private String email;

    @Column(name = "firstName")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "password")
    private String password;

    @Column(name = "repeatPassword")
    private String repeatPassword;

    @Column(name = "bloodGroup")
    private String bloodGroup;
}
