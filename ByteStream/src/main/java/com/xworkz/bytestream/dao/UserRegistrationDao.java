package com.xworkz.bytestream.dao;

import com.xworkz.bytestream.entity.UserEntity;

public interface UserRegistrationDao {

    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
