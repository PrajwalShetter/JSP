package com.xworkz.quickdoc.dao;

import com.xworkz.quickdoc.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}

