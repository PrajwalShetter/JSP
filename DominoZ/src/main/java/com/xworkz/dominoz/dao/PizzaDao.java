package com.xworkz.dominoz.dao;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.constants.Size;
import com.xworkz.dominoz.entity.PizzaEntity;

import java.util.List;

public interface PizzaDao {

    boolean savePizza(PizzaEntity pizzaEntity);
   PizzaEntity getPizzaById(int id);
   boolean updatePrizeById(int id, double prize);
   boolean deletePizzaById(int id);
   List<PizzaEntity> getAllPizza();
   List<String> getPizzaNames();
   PizzaEntity getPizzaDataByName(String pizzaName);
   List<PizzaEntity> getPizzaByPrize(double prize);
   List<PizzaEntity> getPizzaBySize(Size size);
   List<PizzaEntity> getPizzaByCategory(Category category);
   List<PizzaEntity> getPizzaByPriceAndSizeAndCategory(double price, Size size, Category category);
   boolean updatePizzaById(PizzaEntity pizzaEntity);


}
