package com.xworkz.ecotrack.dao;

import com.xworkz.ecotrack.entity.UserEntity;

public interface UserDao {

    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
