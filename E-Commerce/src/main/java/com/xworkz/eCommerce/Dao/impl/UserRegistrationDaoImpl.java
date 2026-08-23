package com.xworkz.eCommerce.Dao.impl;

import com.xworkz.eCommerce.Dao.UserRegistrationDao;
import com.xworkz.eCommerce.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRegistrationDaoImpl implements UserRegistrationDao {

    private  Configuration configuration ;
    private SessionFactory sessionFactory;

    public UserRegistrationDaoImpl(){
        configuration= new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
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
        Session session = sessionFactory.openSession();
        UserEntity user = session.get(UserEntity.class,id);
        session.close();
        sessionFactory.close();

        return user;
    }
}
