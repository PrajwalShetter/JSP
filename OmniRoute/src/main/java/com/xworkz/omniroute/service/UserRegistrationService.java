package com.xworkz.omniroute.service;

import com.xworkz.omniroute.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
