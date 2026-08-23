package com.xworkz.syncsphere.service;

import com.xworkz.syncsphere.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
