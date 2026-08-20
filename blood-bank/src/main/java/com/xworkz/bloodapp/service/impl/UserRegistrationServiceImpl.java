package com.xworkz.bloodapp.service.impl;

import com.xworkz.bloodapp.Dao.UserRegistrationDao;
import com.xworkz.bloodapp.Dao.impl.UserRegistrationDaoImpl;
import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.entity.UserEntity;
import com.xworkz.bloodapp.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
    @Override
    public boolean saveUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setEmail(user.getEmail());
        userEntity.setRepeatPassword(user.getRepeatPassword());
        userEntity.setPassword(user.getPassword());
        userEntity.setBloodGroup(user.getBloodGroup());
        userEntity.setFirstname(user.getFirstname());
        userEntity.setLastname(user.getLastname());


        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(String userId) {

        UserDto userDto = new UserDto();
        UserEntity userEntity=userRegistrationDao.getUserById(userId);
        if(userEntity!= null) {
            userDto.setUserId(userEntity.getUserId());
            userDto.setPassword(userEntity.getPassword());
            userDto.setEmail(userEntity.getEmail());
            userDto.setFirstname(userEntity.getFirstname());
            userDto.setLastname(userEntity.getLastname());
            userDto.setBloodGroup(userEntity.getBloodGroup());
            userDto.setRepeatPassword(userEntity.getRepeatPassword());
        }

        return userDto;
    }
}
