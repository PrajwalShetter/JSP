package com.xworkz.eCommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ecommerce_users")
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "email_id", unique = true, nullable = false)
    private String email;

    @Column(name = "mobile_number", length = 15)
    private String number;

    @Column(name = "shipping_address", length = 500)
    private String address;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "confirm_password")
    private String conPassword;
}
