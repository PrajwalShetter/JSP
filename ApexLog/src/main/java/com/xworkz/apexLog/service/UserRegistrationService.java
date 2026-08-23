package com.xworkz.apexLog.service;

import com.xworkz.apexLog.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
