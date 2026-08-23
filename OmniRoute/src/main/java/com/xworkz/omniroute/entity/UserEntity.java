package com.xworkz.omniroute.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "omniroute_hubs")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dispatcher_id")
    private String dispatcherId;

    @Column(name = "hub_name")
    private String hubName;

    @Column(name = "operating_radius")
    private double operatingRadius;

    @Column(name = "fleet_type")
    private String fleetType;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String conPassword;
}
