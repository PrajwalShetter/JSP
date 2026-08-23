package com.xworkz.syncsphere.dao;

import com.xworkz.syncsphere.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
