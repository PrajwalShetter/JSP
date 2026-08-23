package com.xworkz.fintrack.service;

import com.xworkz.fintrack.dto.UserDto;
import com.xworkz.fintrack.entity.UserEntity;

public interface UserService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
