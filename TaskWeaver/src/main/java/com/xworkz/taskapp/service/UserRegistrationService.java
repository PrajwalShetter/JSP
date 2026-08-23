package com.xworkz.taskapp.service;
import com.xworkz.taskapp.Dto.UserDto;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
