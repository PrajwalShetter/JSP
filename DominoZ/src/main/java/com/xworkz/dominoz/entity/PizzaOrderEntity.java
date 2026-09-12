package com.xworkz.dominoz.entity;

import com.xworkz.dominoz.constants.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "order_table")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PizzaOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userName;
    private long phone;
    @Enumerated(EnumType.STRING)
    private Category category;
    private String pizzaName;
}
