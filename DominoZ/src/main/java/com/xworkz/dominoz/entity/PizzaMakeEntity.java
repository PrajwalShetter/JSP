package com.xworkz.dominoz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Table(name = "pizzaMake_table")
@NoArgsConstructor
@Data

public class PizzaMakeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String employeeName;

    private String pizzaName;
}
