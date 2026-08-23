package com.xworkz.bytestream.service;

import com.xworkz.bytestream.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
