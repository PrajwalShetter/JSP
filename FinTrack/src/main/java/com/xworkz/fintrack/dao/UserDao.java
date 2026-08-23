package com.xworkz.fintrack.dao;

import com.xworkz.fintrack.dto.UserDto;
import com.xworkz.fintrack.entity.UserEntity;

public interface UserDao {

    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
}
