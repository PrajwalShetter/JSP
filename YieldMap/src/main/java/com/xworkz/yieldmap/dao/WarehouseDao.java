package com.xworkz.yieldmap.dao;
import com.xworkz.yieldmap.entity.WarehouseEntity;

import java.util.List;

public interface WarehouseDao {
    boolean saveWarehouse(WarehouseEntity warehouseEntity);
    WarehouseEntity getWarehouse(int id);
    List<WarehouseEntity> getAllWarehouse();
    boolean updateWarehouse(WarehouseEntity warehouseEntity);
    boolean deleteWarehouse(int id);

}
