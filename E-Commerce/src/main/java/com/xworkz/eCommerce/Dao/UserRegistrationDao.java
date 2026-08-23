package com.xworkz.eCommerce.Dao;

import com.xworkz.eCommerce.entity.UserEntity;

public interface UserRegistrationDao {

    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
