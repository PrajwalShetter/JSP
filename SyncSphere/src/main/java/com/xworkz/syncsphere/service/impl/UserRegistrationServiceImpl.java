package com.xworkz.syncsphere.service.impl;

import com.xworkz.syncsphere.dao.UserRegistrationDao;
import com.xworkz.syncsphere.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.syncsphere.dto.UserDto;
import com.xworkz.syncsphere.entity.UserEntity;
import com.xworkz.syncsphere.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {



    @Override
    public boolean saveUser(UserDto user) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setTeamName(user.getTeamName());
        userEntity.setMaxMembers(user.getMaxMembers());
        userEntity.setSecurityLevel(user.getSecurityLevel());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {

        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserDto userDto = new UserDto();
        UserEntity user = userRegistrationDao.getUser(id);
        if(user!= null){
            userDto.setId((user.getId()));
            userDto.setPassword((user.getPassword()));
            userDto.setEmail((user.getEmail()));
            userDto.setSecurityLevel((user.getSecurityLevel()));
            userDto.setConPassword((user.getConPassword()));
            userDto.setMaxMembers((user.getMaxMembers()));
            userDto.setTeamName((user.getTeamName()));

        }
        return  userDto;


    }
}
