package com.xworkz.yieldmap.service;

import com.xworkz.yieldmap.dto.WarehouseDto;
import com.xworkz.yieldmap.entity.WarehouseEntity;

import java.util.List;

public interface WarehouseService {

    boolean saveWarehouse(WarehouseDto warehouseDto);
    WarehouseDto getWarehouse(int id);
    List<WarehouseDto> getAllWarehouse();
    boolean updateWarehouse(WarehouseDto warehouseDto);
    boolean deleteWarehouse(int id);
}
