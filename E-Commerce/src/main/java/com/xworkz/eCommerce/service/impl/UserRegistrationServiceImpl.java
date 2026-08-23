package com.xworkz.eCommerce.service.impl;

import com.xworkz.eCommerce.Dao.UserRegistrationDao;
import com.xworkz.eCommerce.Dao.impl.UserRegistrationDaoImpl;
import com.xworkz.eCommerce.Dto.UserDto;
import com.xworkz.eCommerce.entity.UserEntity;
import com.xworkz.eCommerce.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
    @Override
    public boolean saveUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setEmail(user.getEmail());
        userEntity.setNumber(user.getNumber());
        userEntity.setAddress(user.getAddress());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {

        UserDto userDto = new UserDto();
        UserEntity userEntity=userRegistrationDao.getUser(id);
        if(userEntity != null) {
            userDto.setId(userEntity.getId());
            userDto.setUsername(userEntity.getUsername());
            userDto.setPassword(userEntity.getPassword());
            userDto.setConPassword(userEntity.getConPassword());
            userDto.setAddress(userEntity.getAddress());
            userDto.setNumber(userEntity.getNumber());
            userDto.setEmail(userEntity.getEmail());
        }
        return  userDto;
    }
}
