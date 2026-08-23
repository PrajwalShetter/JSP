package com.xworkz.youtube.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_table")

public class UserEntity {

    @Id
    @Column(name = "handle")
    private String handle;

    @Column(name = "channel_name")
    private  String channelName;

    @Column(name = "email")
    private  String email;

    @Column(name = "category")
    private  String category;
    @Column(name = "password")
    private String password;
    @Column(name = "Confirm_password")
    private String conPassword;

}
