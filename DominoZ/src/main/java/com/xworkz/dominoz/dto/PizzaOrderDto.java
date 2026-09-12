package com.xworkz.dominoz.dto;

import com.xworkz.dominoz.constants.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PizzaOrderDto {

    private int id;
    private String userName;
    private long phone;
    private Category category;
    private String pizzaName;

}
