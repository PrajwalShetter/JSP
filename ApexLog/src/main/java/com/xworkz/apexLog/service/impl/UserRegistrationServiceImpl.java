package com.xworkz.apexLog.service.impl;

import com.xworkz.apexLog.dao.UserRegistrationDao;
import com.xworkz.apexLog.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.entity.UserEntity;
import com.xworkz.apexLog.service.UserRegistrationService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    @Override
    public List<UserDto> getAllUsers() {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        List<UserEntity> userEntities = userRegistrationDao.getAllUsers();
        List<UserDto> userDtos = new ArrayList<>();

        if(userEntities != null){

            userEntities.forEach(userEntity -> {
                UserDto userDto = new UserDto();
                userDto.setId(userEntity.getId());
                userDto.setUserName(userEntity.getUserName());
                userDto.setEmail(userEntity.getEmail());
                userDto.setGender(userEntity.getGender());
                userDto.setAccountType(userEntity.getAccountType());
                userDto.setPassword(userEntity.getPassword());
                userDto.setConfirmPassword(userEntity.getConfirmPassword());

                userDtos.add(userDto);
            });
        }
        return userDtos;
    }

    @Override
    public boolean deleteAccount(int id) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        userRegistrationDao.deleteAccount(id);
        return true;
    }

    @Override
    public boolean updateAccount(UserDto userDto) {

       UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
       UserEntity user= new UserEntity();
       user.setUserName(userDto.getUserName());
        user.setId(userDto.getId());
        user.setAccountType(userDto.getAccountType());
        user.setEmail(userDto.getEmail());
        user.setGender(userDto.getGender());
        userRegistrationDao.updateAccount(user);
        return true;
    }
}
