package com.xworkz.taskapp.service.impl;

import com.xworkz.taskapp.Dao.UserRegistrationDao;
import com.xworkz.taskapp.Dao.impl.UserRegistrationDaoImpl;
import com.xworkz.taskapp.Dto.UserDto;
import com.xworkz.taskapp.entity.UserEntity;
import com.xworkz.taskapp.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {


    @Override
    public boolean saveUser(UserDto user) {

        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setFullName(user.getFullName());
        userEntity.setEmail(user.getEmail());
        userEntity.setWorkspaceCode(user.getWorkspaceCode());
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
        if(user!= null){
            userDto.setId(user.getId());
            userDto.setUserId(user.getUserId());
            userDto.setPassword(user.getPassword());
            userDto.setEmail(user.getEmail());
            userDto.setFullName(user.getFullName());
            userDto.setConfirmPassword(user.getConfirmPassword());
            userDto.setWorkspaceCode(user.getWorkspaceCode());

        }
        return  userDto;
    }
}
