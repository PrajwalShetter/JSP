package com.xworkz.bloodapp.service;

import com.xworkz.bloodapp.dto.UserDto;

public interface UserRegistrationService {

    boolean saveUser(UserDto user);
}
