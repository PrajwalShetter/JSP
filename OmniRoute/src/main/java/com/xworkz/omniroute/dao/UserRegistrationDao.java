package com.xworkz.omniroute.dao;

import com.xworkz.omniroute.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
