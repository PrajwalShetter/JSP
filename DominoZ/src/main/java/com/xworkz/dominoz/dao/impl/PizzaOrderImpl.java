package com.xworkz.dominoz.dao.impl;

import com.xworkz.dominoz.dao.PizzaOrderDao;
import com.xworkz.dominoz.entity.PizzaOrderEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PizzaOrderImpl implements PizzaOrderDao {


    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;


    public  PizzaOrderImpl(){
        entityManagerFactory= Persistence.createEntityManagerFactory("dominoz");
        entityManager = entityManagerFactory.createEntityManager();
    }
    @Override
    public boolean saveOrder(PizzaOrderEntity pizzaOrderEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(pizzaOrderEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }
}
