package com.xworkz.syncsphere.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "syncsphere_workspaces")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "email")
    private String email;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "max_members")
    private double maxMembers;

    @Column(name = "security_level")
    private String securityLevel;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String conPassword;
}
