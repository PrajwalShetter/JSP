package com.xworkz.fintrack.dao.impl;

import com.xworkz.fintrack.dao.UserDao;
import com.xworkz.fintrack.dto.UserDto;
import com.xworkz.fintrack.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDaoImpl implements UserDao {

    Configuration configuration = new Configuration();
    SessionFactory sessionFactory;

    public  UserDaoImpl(){
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
