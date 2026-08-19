package com.xworkz.bloodapp.Dao;

import com.xworkz.bloodapp.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
}
