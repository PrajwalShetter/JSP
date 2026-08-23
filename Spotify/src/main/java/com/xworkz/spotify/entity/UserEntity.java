package com.xworkz.spotify.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spotify_listeners")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "plan_tier")
    private String planTier;

    @Column(name = "stream_allowance")
    private double streamAllowance;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String conPassword;
}
