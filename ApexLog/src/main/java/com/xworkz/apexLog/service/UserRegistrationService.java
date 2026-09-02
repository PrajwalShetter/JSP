package com.xworkz.apexLog.service;

import com.xworkz.apexLog.dto.UserDto;
import com.xworkz.apexLog.entity.UserEntity;

import java.util.List;

public interface UserRegistrationService {
    boolean saveUser(UserDto user);
    UserDto getUser(int id);
    List<UserDto> getAllUsers();
    boolean deleteAccount(int id);
    boolean updateAccount(UserDto userDto);
}
