package com.xworkz.apexLog.service.impl;

import com.xworkz.apexLog.dao.UserRegistrationDao;
import com.xworkz.apexLog.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.entity.UserEntity;
import com.xworkz.apexLog.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {


    @Override
    public boolean saveUser(UserDto user) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();

        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setEmail(user.getEmail());
        userEntity.setGender(user.getGender());
        userEntity.setAccountType(user.getAccountType());
        userEntity.setPassword(user.getPassword());
        userEntity.setConfirmPassword(user.getConfirmPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();

        UserDto userDto = new UserDto();
        UserEntity user = userRegistrationDao.getUser(id);
        if(user != null){
            userDto.setId(user.getId());
            userDto.setUserName(user.getUserName());
            userDto.setPassword(user.getPassword());
            userDto.setGender(user.getGender());
            userDto.setEmail(user.getEmail());
            userDto.setAccountType(user.getAccountType());
            userDto.setConfirmPassword(user.getConfirmPassword());

        }
        return  userDto;
    }
}
