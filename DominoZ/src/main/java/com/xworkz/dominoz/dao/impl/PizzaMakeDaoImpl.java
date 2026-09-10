package com.xworkz.dominoz.dao.impl;

import com.xworkz.dominoz.dao.PizzaMakeDao;
import com.xworkz.dominoz.entity.PizzaMakeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PizzaMakeDaoImpl implements PizzaMakeDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public PizzaMakeDaoImpl(){
        entityManagerFactory= Persistence.createEntityManagerFactory("dominoz");
        entityManager= entityManagerFactory.createEntityManager();
    }
    @Override
    public boolean savePizzaMaker(PizzaMakeEntity pizzaMakeEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(pizzaMakeEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }
}
