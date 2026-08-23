package com.xworkz.eCommerce.service;


import com.xworkz.eCommerce.Dto.UserDto;

public interface UserRegistrationService {

    boolean saveUser(UserDto user);
    UserDto getUser(int id);
}
