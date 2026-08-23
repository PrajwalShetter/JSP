package com.xworkz.guardrail.service;

import com.xworkz.guardrail.dto.UserDto;

public interface UserService {

    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
