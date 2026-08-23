package com.xworkz.fleetwire.service.impl;

import com.xworkz.fleetwire.dao.UserRegistrationDao;
import com.xworkz.fleetwire.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.fleetwire.dto.UserDto;
import com.xworkz.fleetwire.entity.UserEntity;
import com.xworkz.fleetwire.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();

    @Override
    public boolean saveUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setLicenseNumber(user.getLicenseNumber());
        userEntity.setOperatorName(user.getOperatorName());
        userEntity.setVehicleCapacity(user.getVehicleCapacity());
        userEntity.setZoneCode(user.getZoneCode());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {

        UserDto user = new UserDto();
        UserEntity userEntity = userRegistrationDao.getUser(id);
        if(userEntity != null) {
            user.setId(userEntity.getId());
            user.setPassword(userEntity.getPassword());
            user.setConPassword(userEntity.getConPassword());
            user.setOperatorName(userEntity.getOperatorName());
            user.setLicenseNumber(userEntity.getLicenseNumber());
            user.setVehicleCapacity(userEntity.getVehicleCapacity());
            user.setZoneCode(userEntity.getZoneCode());
        }
        return user;

    }
}
