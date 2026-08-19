package com.xworkz.bloodapp.service.impl;

import com.xworkz.bloodapp.Dao.UserRegistrationDoa;
import com.xworkz.bloodapp.Dao.impl.UserRegistrationDaoImpl;
import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.entity.UserEntity;
import com.xworkz.bloodapp.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationDoa userRegistrationDoa = new UserRegistrationDaoImpl();
    @Override
    public boolean saveUser(UserDto user) {

        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setPassword(user.getPassword());
        userEntity.setBloodGroup(user.getBloodGroup());
        userEntity.setRepeatPassword(user.getRepeatPassword());
        userEntity.setLastName(user.getLastName());
        userEntity.setUserId(user.getUserId());

        return userRegistrationDoa.saveUser(userEntity);
    }
}
