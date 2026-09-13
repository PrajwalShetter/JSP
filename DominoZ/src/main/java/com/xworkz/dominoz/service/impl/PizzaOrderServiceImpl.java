package com.xworkz.dominoz.service.impl;

import com.xworkz.dominoz.dao.PizzaOrderDao;
import com.xworkz.dominoz.dao.impl.PizzaOrderImpl;
import com.xworkz.dominoz.dto.PizzaOrderDto;
import com.xworkz.dominoz.entity.PizzaOrderEntity;
import com.xworkz.dominoz.service.PizzaOrderService;

public class PizzaOrderServiceImpl implements PizzaOrderService {

    @Override
    public boolean saveOrder(PizzaOrderDto pizzaOrderDto) {

        PizzaOrderDao pizzaOrderDao = new PizzaOrderImpl();
        PizzaOrderEntity pizzaOrderEntity = new PizzaOrderEntity();

        pizzaOrderEntity.setPizzaName(pizzaOrderDto.getPizzaName());
        pizzaOrderEntity.setCategory(pizzaOrderDto.getCategory());
        pizzaOrderEntity.setPhone(pizzaOrderDto.getPhone());
        pizzaOrderEntity.setUserName(pizzaOrderDto.getUserName());
        pizzaOrderEntity.setId(pizzaOrderDto.getId());
        pizzaOrderDao.saveOrder(pizzaOrderEntity);
        return true;
    }
}
