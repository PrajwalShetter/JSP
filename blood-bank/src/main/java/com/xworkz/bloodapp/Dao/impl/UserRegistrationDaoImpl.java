package com.xworkz.bloodapp.Dao.impl;

import com.xworkz.bloodapp.Dao.UserRegistrationDao;
import com.xworkz.bloodapp.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class UserRegistrationDaoImpl implements UserRegistrationDao {


    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public UserRegistrationDaoImpl(){
        entityManagerFactory = Persistence.createEntityManagerFactory("bloodbank");
        entityManager= entityManagerFactory.createEntityManager();
    }

    @Override
    public boolean saveUser(UserEntity user) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(user);
        transaction.commit();
        session.close();
        sessionFactory.close();

        return true;

    }

    @Override
    public UserEntity getUserById(String userId) {

        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        UserEntity user=session.get(UserEntity.class,userId);
        session.close();
        sessionFactory.close();

        return user;
    }

    @Override
    public List<UserEntity> getAllUser() {
        String jpql = "select u from UserEntity u";
        Query query = entityManager.createQuery(jpql);
        List<UserEntity> user = query.getResultList();
        if(user == null){
            System.out.println("there is no data in the database");
        }
        entityManager.close();
        entityManagerFactory.close();
        return user;
    }

    @Override
    public int deleteUser(int id) {
        entityManager.getTransaction().begin();
        String jpql = "delete from UserEntity u where id=:id";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("id",id);
        int delete= query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return delete;
    }
}
