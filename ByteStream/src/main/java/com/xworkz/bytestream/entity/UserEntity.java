package com.xworkz.bytestream.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")

public class UserEntity {

    @Id
    @Column(name = "stream_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int streamId;

    @Column(name = "chanel_name")
    private  String channelName;

    @Column(name = "email")
    private String email;

    @Column(name = "node_region")
    private String nodeRegion;

    @Column(name = "password")
    private String password;

    @Column(name = "con_password")
    private String conPassword;
}
