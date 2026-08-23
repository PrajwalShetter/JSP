package com.xworkz.edupulse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student_table")
public class StudentEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "roll_number")
    private String rollNumber;

    @Column(name = "name")
    private String studentName;

    @Column(name = "email")
    private String email;

    @Column(name = "semester")
    private String semester;

    @Column(name = "password")
    private String password;

    @Column(name = "Confirm_password")
    private String conPassword;
}
