package com.xworkz.edupulse.dao.impl;

import com.xworkz.edupulse.dao.StudentDao;
import com.xworkz.edupulse.entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDaoImpl implements StudentDao {

    Configuration configuration = new Configuration();
    SessionFactory sessionFactory ;

    public StudentDaoImpl(){
        configuration.configure();
       sessionFactory = configuration.buildSessionFactory();
    }
    @Override
    public boolean saveStudent(StudentEntity student) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public StudentEntity getStudent(int id) {
        Session session = sessionFactory.openSession();
        StudentEntity student = session.get(StudentEntity.class,id);
        session.close();
        sessionFactory.close();

        return student;
    }
}
