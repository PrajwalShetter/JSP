package com.xworkz.dominoz.service;

import com.xworkz.dominoz.dto.PizzaOrderDto;
import com.xworkz.dominoz.entity.PizzaOrderEntity;

public interface PizzaOrderService {

    boolean saveOrder(PizzaOrderDto pizzaOrderDto);
}
