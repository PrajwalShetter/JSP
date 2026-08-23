package com.xworkz.ecotrack.service.impl;

import com.xworkz.ecotrack.dao.UserDao;
import com.xworkz.ecotrack.dao.impl.UserDaoImpl;
import com.xworkz.ecotrack.dto.UserDto;
import com.xworkz.ecotrack.entity.UserEntity;
import com.xworkz.ecotrack.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean saveUser(UserDto user) {
        UserDao userDao = new UserDaoImpl();

        UserEntity userEntity = new UserEntity();
        userEntity.setCarbonCap(user.getCarbonCap());
        userEntity.setPassword(user.getPassword());
        userEntity.setConfirmPassword(user.getConfirmPassword());
        userEntity.setFacilityCode(user.getFacilityCode());
        userEntity.setOrgName(user.getOrgName());
        userEntity.setIndustryType(user.getIndustryType());

        userDao.saveUser(userEntity);

        return true;
    }

    @Override
    public UserDto getUser(int id) {
      UserDao userDao = new UserDaoImpl();
      UserDto user = new UserDto();
      UserEntity userEntity = userDao.getUser(id);
      if(userEntity != null) {
          user.setCarbonCap(userEntity.getCarbonCap());
          user.setPassword(userEntity.getPassword());
          user.setConfirmPassword(userEntity.getConfirmPassword());
          user.setOrgName(userEntity.getOrgName());
          user.setFacilityCode(userEntity.getFacilityCode());
          user.setIndustryType(userEntity.getIndustryType());

      }
        return user;
    }
}
