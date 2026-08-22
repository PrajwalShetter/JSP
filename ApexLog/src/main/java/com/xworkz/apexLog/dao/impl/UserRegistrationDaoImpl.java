package com.xworkz.apexLog.dao.impl;

import com.xworkz.apexLog.dao.UserRegistrationDao;
import com.xworkz.apexLog.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRegistrationDaoImpl implements UserRegistrationDao {

    private Configuration configuration = new Configuration();
    private SessionFactory sessionFactory;

    public UserRegistrationDaoImpl() {
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
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
        Session session = sessionFactory.openSession();
        UserEntity user = session.get(UserEntity.class,id);
        session.close();
        sessionFactory.close();

        return user ;
    }
}
