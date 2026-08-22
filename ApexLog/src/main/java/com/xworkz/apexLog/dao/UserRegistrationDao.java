package com.xworkz.apexLog.dao;

import com.xworkz.apexLog.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
