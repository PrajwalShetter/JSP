package com.xworkz.bloodapp.Dao;

import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.entity.UserEntity;

public interface UserRegistrationDoa {

    boolean saveUser(UserEntity user);
}
