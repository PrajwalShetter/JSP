package com.xworkz.omniroute.service.impl;

import com.xworkz.omniroute.dao.UserRegistrationDao;
import com.xworkz.omniroute.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.omniroute.dto.UserDto;
import com.xworkz.omniroute.entity.UserEntity;
import com.xworkz.omniroute.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {



    @Override
    public boolean saveUser(UserDto user) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = new UserEntity();
        userEntity.setDispatcherId(user.getDispatcherId());
        userEntity.setHubName(user.getHubName());
        userEntity.setOperatingRadius(user.getOperatingRadius());
        userEntity.setFleetType(user.getFleetType());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = userRegistrationDao.getUser(id);
        UserDto userDto = new UserDto();

        if(userEntity!= null);
        {
            userDto.setId(userEntity.getId());
            userDto.setPassword(userEntity.getPassword());
            userDto.setConPassword(userEntity.getConPassword());
            userDto.setDispatcherId(userEntity.getDispatcherId());
            userDto.setHubName(userEntity.getHubName());
            userDto.setFleetType(userEntity.getFleetType());
            userDto.setOperatingRadius(userEntity.getOperatingRadius());

        }
        return userDto;
    }
}
