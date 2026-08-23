package com.xworkz.fintrack.service.impl;

import com.xworkz.fintrack.dao.UserDao;
import com.xworkz.fintrack.dao.impl.UserDaoImpl;
import com.xworkz.fintrack.dto.UserDto;
import com.xworkz.fintrack.entity.UserEntity;
import com.xworkz.fintrack.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();
    @Override
    public boolean saveUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(user.getUserName());
        userEntity.setSaving(user.getSaving());
        userEntity.setIncome(user.getIncome());
        userEntity.setCurrency(user.getCurrency());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {
        UserDto userDto = new UserDto();
        UserEntity user = userDao.getUser(id);
        if(user != null) {
            userDto.setConPassword(user.getConPassword());
            userDto.setId(user.getId());
            userDto.setUserName(user.getUserName());
            userDto.setSaving(user.getSaving());
            userDto.setIncome(user.getIncome());
            userDto.setPassword(user.getPassword());
            userDto.setCurrency(user.getCurrency());
        }
        return  userDto;
    }
}
