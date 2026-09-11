package com.xworkz.dominoz.service.impl;

import com.xworkz.dominoz.dao.PizzaMakeDao;
import com.xworkz.dominoz.dao.impl.PizzaMakeDaoImpl;
import com.xworkz.dominoz.dto.PizzaMakeDto;
import com.xworkz.dominoz.entity.PizzaMakeEntity;
import com.xworkz.dominoz.service.PizzaMakeService;

public class PizzaMakeServiceImpl implements PizzaMakeService {
    @Override
    public boolean savePizzaMaker(PizzaMakeDto pizzaMakeDto) {
        PizzaMakeDao pizzaMakeDao = new PizzaMakeDaoImpl();
        PizzaMakeEntity pizzaMakeEntity = new PizzaMakeEntity();
        pizzaMakeEntity.setPizzaName(pizzaMakeDto.getPizzaName());
        pizzaMakeEntity.setEmployeeName(pizzaMakeDto.getEmployeeName());
         pizzaMakeDao.savePizzaMaker(pizzaMakeEntity);
        return true;
    }
}
