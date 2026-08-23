package com.xworkz.guardrail.dao.impl;

import com.xworkz.guardrail.dao.UserDao;
import com.xworkz.guardrail.entity.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoImpl implements UserDao {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public UserDaoImpl(){
            entityManagerFactory = Persistence.createEntityManagerFactory("guardrail");
            entityManager =entityManagerFactory.createEntityManager();
    }
    @Override
    public boolean saveUser(UserEntity user) {

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();

        return true;
    }

    @Override
    public UserEntity getUser(int id) {

      UserEntity user = entityManager.find(UserEntity.class,id);
      entityManager.close();

        return user;
    }
}
