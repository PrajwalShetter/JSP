package com.xworkz.dominoz.service;

import com.xworkz.dominoz.dto.PizzaMakeDto;
import com.xworkz.dominoz.entity.PizzaMakeEntity;

public interface PizzaMakeService {

    boolean savePizzaMaker(PizzaMakeDto pizzaMakeDto);
}
