package com.xworkz.fleetwire.service;

import com.xworkz.fleetwire.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
