package com.xworkz.dominoz.dao.impl;

import com.xworkz.dominoz.constants.Category;
import com.xworkz.dominoz.constants.Size;
import com.xworkz.dominoz.dao.PizzaDao;
import com.xworkz.dominoz.entity.PizzaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

public class PizzaDaoImpl implements PizzaDao {

    private  EntityManagerFactory entityManagerFactory;
    private  EntityManager entityManager;


    public  PizzaDaoImpl(){
        entityManagerFactory= Persistence.createEntityManagerFactory("dominoz");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public boolean savePizza(PizzaEntity pizzaEntity) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dominoz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(pizzaEntity);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

            return true;
    }

    @Override
    public PizzaEntity getPizzaById(int id) {
       PizzaEntity pizzaEntity = entityManager.find(PizzaEntity.class,id);

       if(pizzaEntity == null){
           System.out.println("Id is not found");
       }
       entityManager.close();
       return pizzaEntity;

    }

    @Override
    public boolean updatePrizeById(int id, double prize) {

        entityManager.getTransaction().begin();
        PizzaEntity pizzaEntity= entityManager.find(PizzaEntity.class,id);
        pizzaEntity.setPrice(prize);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public boolean deletePizzaById(int id) {
        entityManager.getTransaction().begin();
        PizzaEntity pizzaEntity = entityManager.find(PizzaEntity.class,id);
        entityManager.remove(pizzaEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public List<PizzaEntity> getAllPizza() {
        String jpql = "select p from PizzaEntity p";
        Query query = entityManager.createQuery(jpql);
         List<PizzaEntity> pizzas = query.getResultList();

         if(pizzas == null){
             System.out.println("there is no pizzas in your database");
         }
         entityManager.close();
         entityManagerFactory.close();
        return pizzas;
    }

    @Override
    public List<String> getPizzaNames() {

        String jpql = "select p.name from PizzaEntity p";
        Query query = entityManager.createQuery(jpql);
        List<String> names = query.getResultList();

        if(names!= null){
            System.out.println("there is no names in DB");
        }
        entityManager.close();
        entityManagerFactory.close();

        return names;
    }

    @Override
    public PizzaEntity getPizzaDataByName(String pizzaName){

         String jpql = "select p from PizzaEntity p where p.name =: pName";

               Query query = entityManager.createQuery(jpql);
               query.setParameter("pName" , pizzaName );
               PizzaEntity pizzaEntity = (PizzaEntity) query.getSingleResult();
               entityManager.close();
               entityManagerFactory.close();
               return pizzaEntity;

    }

    @Override
    public List<PizzaEntity> getPizzaByPrize(double prize) {

        String jpql = "select p from PizzaEntity p where p.price <=: prize";
        Query query= entityManager.createQuery(jpql);
        query.setParameter("prize",prize);
        List<PizzaEntity> pizzaEntity = query.getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return pizzaEntity;
    }

    @Override
    public List<PizzaEntity> getPizzaBySize(Size size) {

        String jpql ="select p from PizzaEntity p where p.size =: size";
        Query query = entityManager.createQuery(jpql);
        query.setParameter("size", size);
        List<PizzaEntity> pizzaEntities = query.getResultList();
        entityManager.close();
        entityManagerFactory.close();

        return pizzaEntities;

    }

    @Override
    public List<PizzaEntity> getPizzaByCategory(Category category) {
       String jpql = "select p from PizzaEntity p where p.category=:category";
       Query query = entityManager.createQuery(jpql);
       query.setParameter("category",category);
       List<PizzaEntity> pizzaEntities = query.getResultList();
       entityManager.close();
       entityManagerFactory.close();
        return pizzaEntities;
    }

    @Override
    public List<PizzaEntity> getPizzaByPriceAndSizeAndCategory(double price, Size size, Category category) {

        Query query = null;

        if (price >= 0 && (size == null || size.toString().isEmpty()) && (category == null || category.toString().isEmpty())) {

            String jpql = "select p from PizzaEntity p where p.price <= :price";

            query = entityManager.createQuery(jpql);
            query.setParameter("price", price);

        } else if (price >= 0 && (size != null || !size.toString().isEmpty()) && (category == null || category.toString().isEmpty())) {

            String jpql = "select p from PizzaEntity p where p.price <= :price and p.size = :size";

            query = entityManager.createQuery(jpql);
            query.setParameter("price", price);
            query.setParameter("size", size);

        } else if (price >= 0 && (category != null || !category.toString().isEmpty()) && (size == null || size.toString().isEmpty())) {

            String jpql = "select p from PizzaEntity p where p.price <= :price and p.category = :category";

            query = entityManager.createQuery(jpql);
            query.setParameter("price", price);
            query.setParameter("category", category);

        } else if (price == 0 && (size != null || !size.toString().isEmpty()) && (category != null || !category.toString().isEmpty())) {

            String jpql = "select p from PizzaEntity p where p.size = :size and p.category = :category";

            query = entityManager.createQuery(jpql);
            query.setParameter("size", size);
            query.setParameter("category", category);

        } else if (price == 0 && (size != null || !size.toString().isEmpty()) && (category == null || category.toString().isEmpty())) {

            String jpql = "select p from PizzaEntity p where p.size = :size";

            query = entityManager.createQuery(jpql);
            query.setParameter("size", size);

        } else if (price == 0 && (size == null || size.toString().isEmpty()) && (category != null || !category.toString().isEmpty())) {

            String jpql = "select p from PizzaEntity p where p.category = :category";

            query = entityManager.createQuery(jpql);
            query.setParameter("category", category);

        }else if (price >= 0 && (size != null || !size.toString().isEmpty()) && (category != null || !category.toString().isEmpty())) {

            String jpql = "select p from PizzaEntity p where p.price <= :price and p.size = :size and p.category = :category";

            query = entityManager.createQuery(jpql);

            query.setParameter("price", price);
            query.setParameter("size", size);
            query.setParameter("category", category);
        } else {
            String jpql = "select p from PizzaEntity p";
            query = entityManager.createQuery(jpql);
        }

        List<PizzaEntity> pizzaEntities = query.getResultList();
        entityManager.close();
        entityManagerFactory.close();

        return pizzaEntities;
    }

    @Override
    public boolean updatePizzaById(PizzaEntity pizzaEntity) {

        entityManager.getTransaction().begin();
        entityManager.merge(pizzaEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }
}