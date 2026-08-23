package com.xworkz.bytestream.service.impl;

import com.xworkz.bytestream.dao.UserRegistrationDao;
import com.xworkz.bytestream.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.bytestream.dto.UserDto;
import com.xworkz.bytestream.entity.UserEntity;
import com.xworkz.bytestream.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
    @Override
    public boolean saveUser(UserDto user) {

        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setPassword(user.getPassword());
        userEntity.setChannelName(user.getChannelName());
        userEntity.setNodeRegion(user.getNodeRegion());
        userEntity.setStreamId(user.getStreamId());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();

        UserDto userDto = new UserDto();
        UserEntity user = userRegistrationDao.getUser(id);
        if(user != null){
            userDto.setStreamId(user.getStreamId());
            userDto.setConPassword(user.getConPassword());
            userDto.setPassword(user.getPassword());
            userDto.setNodeRegion(user.getNodeRegion());
            userDto.setEmail(user.getEmail());
            userDto.setChannelName(user.getChannelName());

        }
        return  userDto;
    }
}
