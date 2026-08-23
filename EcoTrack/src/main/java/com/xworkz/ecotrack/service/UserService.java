package com.xworkz.ecotrack.service;

import com.xworkz.ecotrack.dto.UserDto;

public interface UserService {

    boolean saveUser(UserDto user);
    UserDto getUser(int id);

}
