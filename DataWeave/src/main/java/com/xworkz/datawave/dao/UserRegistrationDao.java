package com.xworkz.datawave.dao;

import com.xworkz.datawave.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
