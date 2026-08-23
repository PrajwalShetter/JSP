package com.xworkz.taskapp.Dao.impl;

import com.xworkz.taskapp.Dao.UserRegistrationDao;
import com.xworkz.taskapp.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserRegistrationDaoImpl implements UserRegistrationDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public UserRegistrationDaoImpl(){
        entityManagerFactory = Persistence.createEntityManagerFactory("task");
        entityManager= entityManagerFactory.createEntityManager();
    }
    @Override
    public boolean saveUser(UserEntity user) {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();

        session.close();
        sessionFactory.close();

        return true;
    }

    @Override
    public UserEntity getUser(int id) {

        UserEntity user = entityManager.find(UserEntity.class,id);
        entityManager.close();
        return user;

    }
}
