package com.xworkz.launchpadx.dao.impl;

import com.xworkz.launchpad.dao.UserRegistrationDao;
import com.xworkz.launchpad.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserRegistrationDaoImpl implements UserRegistrationDao {

    private Configuration configuration = new Configuration();
    private SessionFactory sessionFactory;
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public UserRegistrationDaoImpl() {
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();

        entityManagerFactory = Persistence.createEntityManagerFactory("launchpad");
        entityManager= entityManagerFactory.createEntityManager();
    }

    @Override
    public boolean saveUser(UserEntity user) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(user);

        transaction.commit();
        session.close();
        return true;
    }


    @Override
    public UserEntity getUser(int id) {
        UserEntity user = entityManager.find(UserEntity.class,id);
        entityManager.close();
        return user;
    }
}
