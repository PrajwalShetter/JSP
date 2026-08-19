package com.xworkz.bloodapp.Dao.impl;

import com.xworkz.bloodapp.Dao.UserRegistrationDoa;
import com.xworkz.bloodapp.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRegistrationDaoImpl implements UserRegistrationDoa {

  private Configuration configuration = new Configuration();
  private SessionFactory sessionFactory;


  public UserRegistrationDaoImpl(){

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
        System.out.println("data Saved Successfully");
        return true;
    }
}
