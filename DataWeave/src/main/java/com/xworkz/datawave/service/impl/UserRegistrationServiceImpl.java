package com.xworkz.datawave.service.impl;

import com.xworkz.datawave.dao.UserRegistrationDao;
import com.xworkz.datawave.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.datawave.dto.UserDto;
import com.xworkz.datawave.entity.UserEntity;
import com.xworkz.datawave.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();

    @Override
    public boolean saveUser(UserDto user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setPipelineId(user.getPipelineId());
        userEntity.setStreamName(user.getStreamName());
        userEntity.setEmail(user.getEmail());
        userEntity.setDataSchema(user.getDataSchema());
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
            userDto.setPipelineId(user.getPipelineId());
            userDto.setConfirmPassword(user.getConfirmPassword());
            userDto.setPassword(user.getPassword());
            userDto.setDataSchema(user.getDataSchema());
            userDto.setEmail(user.getEmail());
            userDto.setStreamName(user.getStreamName());

        }
        return  userDto;
    }

}
