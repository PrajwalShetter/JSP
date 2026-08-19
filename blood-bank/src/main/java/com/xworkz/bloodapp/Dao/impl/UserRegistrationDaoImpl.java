package com.xworkz.bloodapp.Dao.impl;

import com.xworkz.bloodapp.Dao.UserRegistrationDao;
import com.xworkz.bloodapp.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRegistrationDaoImpl implements UserRegistrationDao {

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
}
