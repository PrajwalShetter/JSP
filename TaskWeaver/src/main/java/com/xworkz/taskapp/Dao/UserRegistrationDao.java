package com.xworkz.taskapp.Dao;

import com.xworkz.taskapp.entity.UserEntity;

public interface UserRegistrationDao {

    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
