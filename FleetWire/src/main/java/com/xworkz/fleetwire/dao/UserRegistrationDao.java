package com.xworkz.fleetwire.dao;

import com.xworkz.fleetwire.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
