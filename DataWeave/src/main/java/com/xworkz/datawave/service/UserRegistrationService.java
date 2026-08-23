package com.xworkz.datawave.service;

import com.xworkz.datawave.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
