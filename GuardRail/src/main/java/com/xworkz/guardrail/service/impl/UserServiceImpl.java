package com.xworkz.guardrail.service.impl;

import com.xworkz.guardrail.dao.UserDao;
import com.xworkz.guardrail.dao.impl.UserDaoImpl;
import com.xworkz.guardrail.dto.UserDto;
import com.xworkz.guardrail.entity.UserEntity;
import com.xworkz.guardrail.service.UserService;

public class UserServiceImpl implements UserService {


    @Override
    public boolean saveUser(UserDto user) {

        UserDao userDao = new UserDaoImpl();
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        userEntity.setUsername(user.getUsername());
        userEntity.setNodeCode(user.getNodeCode());
        userEntity.setComplianceLevel(user.getComplianceLevel());
        userEntity.setConfirmPassword(user.getConfirmPassword());

        userDao.saveUser(userEntity);

        return true;
    }

    @Override
    public UserDto getUser(int id) {

        UserDao userDao = new UserDaoImpl();
        UserEntity userEntity = userDao.getUser(id);
        UserDto userDto = new UserDto();

        if(userEntity != null) {
            userDto.setEmail(userEntity.getEmail());
            userDto.setConfirmPassword(userEntity.getConfirmPassword());
            userDto.setPassword(userEntity.getPassword());
            userDto.setId(userEntity.getId());
            userDto.setUsername(userEntity.getUsername());
            userDto.setNodeCode(userEntity.getNodeCode());
            userDto.setComplianceLevel(userEntity.getComplianceLevel());
        }
        System.out.println(userDto);
        return userDto;
    }
}
