package com.xworkz.launchpad.dao;

import com.xworkz.launchpad.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
