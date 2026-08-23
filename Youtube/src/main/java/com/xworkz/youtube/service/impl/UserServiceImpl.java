package com.xworkz.youtube.service.impl;

import com.xworkz.youtube.dao.UserDao;
import com.xworkz.youtube.dao.impl.UserDaoImpl;
import com.xworkz.youtube.dto.UserDto;
import com.xworkz.youtube.entity.UserEntity;
import com.xworkz.youtube.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();
    @Override
    public boolean saveUser(UserDto user) {

        UserEntity userEntity = new UserEntity();
        userEntity.setHandle(user.getHandle());
        userEntity.setCategory(user.getCategory());
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());
        userEntity.setChannelName(user.getChannelName());

        userDao.saveUser(userEntity);
        return true;
    }
}
