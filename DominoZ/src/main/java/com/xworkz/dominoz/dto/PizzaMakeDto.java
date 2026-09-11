package com.xworkz.dominoz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class PizzaMakeDto {

    private int id;
    private String employeeName;
    private String pizzaName;

}
