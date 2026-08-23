package com.xworkz.launchpad.service;

import com.xworkz.launchpad.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
