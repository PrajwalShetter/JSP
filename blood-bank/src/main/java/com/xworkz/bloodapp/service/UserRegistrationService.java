package com.xworkz.bloodapp.service;

import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.entity.UserEntity;

import java.util.List;

public interface UserRegistrationService {

    boolean saveUser(UserDto user);
    UserDto getUser(String userId);
    List<UserDto> getAllUser();
    int deleteUser(int id);
}
