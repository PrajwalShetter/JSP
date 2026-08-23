package com.xworkz.spotify.service;

import com.xworkz.spotify.dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
