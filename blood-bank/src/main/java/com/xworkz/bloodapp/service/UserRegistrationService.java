package com.xworkz.bloodapp.service;

import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.entity.UserEntity;

public interface UserRegistrationService {

    boolean saveUser(UserDto user);
    UserDto getUser(String userId);
}
