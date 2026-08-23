package com.xworkz.launchpad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "launchpad_clusters")
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "repo_url")
    private String repoUrl;

    @Column(name = "environment")
    private String environment;

    @Column(name = "storage_size")
    private double storageSize;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String conPassword;
}
