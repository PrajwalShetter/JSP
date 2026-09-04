package com.xworkz.yieldmap.service.impl;

import com.xworkz.yieldmap.dao.WarehouseDao;
import com.xworkz.yieldmap.dao.impl.WarehouseDaoImpl;
import com.xworkz.yieldmap.dto.WarehouseDto;
import com.xworkz.yieldmap.entity.WarehouseEntity;
import com.xworkz.yieldmap.service.WarehouseService;

import java.util.ArrayList;
import java.util.List;

public class WarehouseServiceImpl implements WarehouseService {

    @Override
    public boolean saveWarehouse(WarehouseDto warehouseDto) {
        WarehouseDao warehouseDao = new WarehouseDaoImpl();
        WarehouseEntity warehouseEntity = new WarehouseEntity();
//        warehouseEntity.setId(user.getId());
        warehouseEntity.setEmail(warehouseDto.getEmail());
        warehouseEntity.setPassword(warehouseDto.getPassword());
        warehouseEntity.setConfirmPassword(warehouseDto.getConfirmPassword());
        warehouseEntity.setStationId(warehouseDto.getStationId());
        warehouseEntity.setRegionCode(warehouseDto.getRegionCode());
        warehouseEntity.setVaultCapacity(warehouseDto.getVaultCapacity());
        warehouseDao.saveWarehouse(warehouseEntity);
        return true;
    }

    @Override
    public WarehouseDto getWarehouse(int id) {

        WarehouseDao userDao = new WarehouseDaoImpl();
        WarehouseDto warehouseDto = new WarehouseDto();
        WarehouseEntity warehouseEntity = userDao.getWarehouse(id);
        if(warehouseEntity!= null){
            warehouseDto.setId(warehouseEntity.getId());
            warehouseDto.setEmail(warehouseEntity.getEmail());
            warehouseDto.setPassword(warehouseEntity.getPassword());
            warehouseDto.setStationId(warehouseEntity.getStationId());
            warehouseDto.setRegionCode(warehouseEntity.getRegionCode());
            warehouseDto.setConfirmPassword(warehouseEntity.getConfirmPassword());
            warehouseDto.setVaultCapacity(warehouseEntity.getVaultCapacity());

        }

        return warehouseDto;
    }

    @Override
    public List<WarehouseDto> getAllWarehouse() {

        WarehouseDao warehouseDao = new WarehouseDaoImpl();
        List<WarehouseEntity> userEntities = warehouseDao.getAllWarehouse();

        List<WarehouseDto> warehouseDtos = new ArrayList<>();

        userEntities.forEach(warehouseEntity -> {

            if(warehouseEntity != null){
                WarehouseDto warehouseDto = new WarehouseDto();
                warehouseDto.setId(warehouseEntity.getId());
                warehouseDto.setEmail(warehouseEntity.getEmail());
                warehouseDto.setVaultCapacity(warehouseEntity.getVaultCapacity());
                warehouseDto.setStationId(warehouseEntity.getStationId());
                warehouseDto.setRegionCode(warehouseEntity.getRegionCode());
                warehouseDtos.add(warehouseDto);
            }
        });
        return warehouseDtos;

    }

    @Override
    public boolean updateWarehouse(WarehouseDto warehouseDto) {
        WarehouseDao warehouseDao = new WarehouseDaoImpl();

       WarehouseEntity warehouseEntity = new WarehouseEntity();
       warehouseEntity.setId(warehouseDto.getId());
        warehouseEntity.setEmail(warehouseDto.getEmail());
        warehouseEntity.setStationId(warehouseDto.getStationId());
        warehouseEntity.setRegionCode(warehouseDto.getRegionCode());
        warehouseEntity.setVaultCapacity(warehouseDto.getVaultCapacity());
        warehouseDao.updateWarehouse(warehouseEntity);

        return true;
    }

    @Override
    public boolean deleteWarehouse(int id) {
        WarehouseDao warehouseDao = new WarehouseDaoImpl();
        return warehouseDao.deleteWarehouse(id);
    }
}
