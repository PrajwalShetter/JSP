package com.xworkz.quickdoc.service.impl;

import com.xworkz.quickdoc.dao.UserRegistrationDao;
import com.xworkz.quickdoc.dao.impl.UserRegistrationDaoImpl;
import com.xworkz.quickdoc.dto.UserDto;
import com.xworkz.quickdoc.entity.UserEntity;
import com.xworkz.quickdoc.service.UserRegistrationService;

public class UserRegistrationServiceImpl implements UserRegistrationService {



    @Override
    public boolean saveUser(UserDto user) {
        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity = new UserEntity();
        userEntity.setLicenseNumber(user.getLicenseNumber());
        userEntity.setDoctorName(user.getDoctorName());
        userEntity.setExperienceYears(user.getExperienceYears());
        userEntity.setSpecialty(user.getSpecialty());
        userEntity.setPassword(user.getPassword());
        userEntity.setConPassword(user.getConPassword());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(int id) {

        UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();
        UserEntity userEntity= userRegistrationDao.getUser(id);
        UserDto userDto = new UserDto();

        if(userEntity != null){
            userDto.setId(userEntity.getId());
            userDto.setPassword(userEntity.getPassword());
            userDto.setSpecialty(userEntity.getSpecialty());
            userDto.setConPassword(userEntity.getConPassword());
            userDto.setDoctorName(userEntity.getDoctorName());
            userDto.setExperienceYears(userEntity.getExperienceYears());
            userDto.setLicenseNumber(userEntity.getLicenseNumber());

        }
        return  userDto;

    }
}
