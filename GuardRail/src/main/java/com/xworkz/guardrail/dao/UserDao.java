package com.xworkz.guardrail.dao;

import com.xworkz.guardrail.entity.UserEntity;

public interface UserDao {

    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
