package com.xworkz.spotify.service.impl;

import com.xworkz.spotify.dao.UserRegistrationDao;
import com.xworkz.spotify.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.spotify.dto.UserDto;
import com.xworkz.spotify.entity.UserEntity;
import com.xworkz.spotify.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {



    @Override
    public boolean saveUser(UserDto user) {

        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setEmail(user.getEmail());
        userEntity.setPlanTier(user.getPlanTier());
        userEntity.setStreamAllowance(user.getStreamAllowance());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {

        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = userRegistrationDao.getUser(id);
        UserDto userDto = new UserDto();

        if(userEntity!= null){
            userDto.setId(userEntity.getId());
            userDto.setPassword(userEntity.getPassword());
            userDto.setConPassword(userEntity.getConPassword());
            userDto.setEmail(userEntity.getEmail());
            userDto.setUsername(userEntity.getUsername());
            userDto.setPlanTier(userEntity.getPlanTier());
            userDto.setStreamAllowance(userEntity.getStreamAllowance());

        }

        return userDto;
    }
}
