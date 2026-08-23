package com.xworkz.launchpad.service.impl;

import com.xworkz.launchpad.dao.UserRegistrationDao;

import com.xworkz.launchpad.dto.UserDto;
import com.xworkz.launchpad.entity.UserEntity;
import com.xworkz.launchpad.service.UserRegistrationService;
import com.xworkz.launchpadx.dao.impl.UserRegistrationDaoImpl;

public class UserRegistrationServiceImpl implements UserRegistrationService {



    @Override
    public boolean saveUser(UserDto user) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setRepoUrl(user.getRepoUrl());
        userEntity.setEnvironment(user.getEnvironment());
        userEntity.setStorageSize(user.getStorageSize());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {

        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity user = userRegistrationDao.getUser(id);
        UserDto userDto = new UserDto();

        if(user!= null){
            userDto.setEnvironment(user.getEnvironment());
            userDto.setId(user.getId());
            userDto.setPassword(user.getPassword());
            userDto.setConPassword(user.getConPassword());
            userDto.setRepoUrl(user.getRepoUrl());
            userDto.setStorageSize(user.getStorageSize());
            userDto.setUsername(user.getUsername());
        }
        return  userDto;
    }
}
