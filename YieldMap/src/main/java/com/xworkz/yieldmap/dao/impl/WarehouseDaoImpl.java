package com.xworkz.yieldmap.dao.impl;

import com.xworkz.yieldmap.dao.WarehouseDao;
import com.xworkz.yieldmap.entity.WarehouseEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class WarehouseDaoImpl implements WarehouseDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public WarehouseDaoImpl(){
        entityManagerFactory = Persistence.createEntityManagerFactory("yieldmap");
        entityManager = entityManagerFactory.createEntityManager();
    }
    @Override
    public boolean saveWarehouse(WarehouseEntity warehouseEntity) {
        entityManager.getTransaction().begin();
        entityManager.persist(warehouseEntity);
        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    @Override
    public WarehouseEntity getWarehouse(int id) {

      WarehouseEntity warehouseEntity =entityManager.find(WarehouseEntity.class,id);
      entityManager.close();
        return warehouseEntity;
    }

    @Override
    public List<WarehouseEntity> getAllWarehouse() {

        List<WarehouseEntity> warehouseEntities = entityManager.createQuery("select w from WarehouseEntity w").getResultList();
        entityManager.close();
        return warehouseEntities;
    }

    @Override
    public boolean updateWarehouse(WarehouseEntity warehouseEntity) {
        entityManager.getTransaction().begin();
        entityManager.merge(warehouseEntity);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
        return true;
    }

    public boolean deleteWarehouse(int id) {

        try {
            entityManager.getTransaction().begin();
            int delete = entityManager.createQuery("delete from WarehouseEntity w where w.id = :id").setParameter("id", id).executeUpdate();
            entityManager.getTransaction().commit();
            return delete > 0;
        }
        catch (Exception e) {
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace();
            return false;
        }
    }
}
