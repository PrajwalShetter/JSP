package com.xworkz.dominoz.dao.impl;

import com.xworkz.dominoz.dao.EmployeeDao;
import com.xworkz.dominoz.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public EmployeeDaoImpl(){
        entityManagerFactory = Persistence.createEntityManagerFactory("dominoz");
        entityManager = entityManagerFactory.createEntityManager();

    }
    @Override
    public boolean saveEmployee(EmployeeEntity employeeEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(employeeEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManager.close();
        return true;
    }

    @Override
    public List<EmployeeEntity> getEmployees() {
        String jpql= "select e from EmployeeEntity e";
        List<EmployeeEntity> employeeEntities= entityManager.createQuery(jpql).getResultList();
        entityManager.close();
        entityManager.close();
        return employeeEntities;
    }

    @Override
    public EmployeeEntity getEmployeeById(int id) {
        EmployeeEntity employeeEntities = (EmployeeEntity) entityManager.createNamedQuery("getEmployeeById")
                .setParameter("id",id).getSingleResult();
        entityManager.close();
        entityManagerFactory.close();
        return employeeEntities;
    }

    @Override
    public List<EmployeeEntity> getEmployeeByAge(int age) {
        List<EmployeeEntity> employeeEntities = entityManager.createNamedQuery("getEmployeeByAge")
                .setParameter("age", age).getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return employeeEntities;
    }

    @Override
    public boolean updateEmployee(EmployeeEntity employeeEntity) {
        entityManager.getTransaction().begin();
        entityManager.merge(employeeEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public boolean deleteEmployee(int id) {
        entityManager.getTransaction().begin();
        String jpql = "delete from EmployeeEntity e where id=:id";
        Query query=entityManager.createQuery(jpql);
        query.setParameter("id",id);
        query.executeUpdate();
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        return true;
    }
}
