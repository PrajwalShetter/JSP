package com.xworkz.quickdoc.service;

import com.xworkz.quickdoc.dto.UserDto;
import com.xworkz.quickdoc.entity.UserEntity;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
