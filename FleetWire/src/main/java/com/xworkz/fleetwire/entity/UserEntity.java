package com.xworkz.fleetwire.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fleet_operators")
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "license_number")
    private String licenseNumber;

    @Column(name = "operator_name")
    private String operatorName;

    @Column(name = "vehicle_capacity")
    private double vehicleCapacity;

    @Column(name = "zone_code")
    private String zoneCode;

    @Column(name = "password")
    private String password;

    @Column(name = "confirm_password")
    private String conPassword;
}
