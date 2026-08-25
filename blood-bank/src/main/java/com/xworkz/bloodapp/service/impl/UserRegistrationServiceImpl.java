package com.xworkz.bloodapp.service.impl;

import com.xworkz.bloodapp.Dao.UserRegistrationDao;
import com.xworkz.bloodapp.Dao.impl.UserRegistrationDaoImpl;
import com.xworkz.bloodapp.dto.UserDto;
import com.xworkz.bloodapp.entity.UserEntity;
import com.xworkz.bloodapp.service.UserRegistrationService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRegistrationServiceImpl implements UserRegistrationService {

    UserRegistrationDao userRegistrationDao = new UserRegistrationDaoImpl();

    @Override
    public boolean saveUser(UserDto user) {
        // 1. Check if the DTO object itself is null
        if (user == null) {
            System.err.println("Validation Failed: User data cannot be null.");
            return false;
        }

        // 2. Validate Firstname (Cannot be null or empty)
        if (user.getFirstname() == null || user.getFirstname().trim().isEmpty()) {
            System.err.println("Validation Failed: First name is required.");
            return false;
        }

        // 3. Validate Lastname (Cannot be null or empty)
        if (user.getLastname() == null || user.getLastname().trim().isEmpty()) {
            System.err.println("Validation Failed: Last name is required.");
            return false;
        }

        // 4. Validate Email (Cannot be null, empty, and must contain '@' and '.')
        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            System.err.println("Validation Failed: Email is required.");
            return false;
        }
        if (!user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            System.err.println("Validation Failed: Invalid email format.");
            return false;
        }

        // 5. Validate Password (Cannot be null or empty, minimum 6 characters)
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.err.println("Validation Failed: Password is required.");
            return false;
        }
        if (user.getPassword().length() < 6) {
            System.err.println("Validation Failed: Password must be at least 6 characters long.");
            return false;
        }

        // 6. Validate Repeat Password (Must exactly match the original password)
        if (user.getRepeatPassword() == null || !user.getRepeatPassword().equals(user.getPassword())) {
            System.err.println("Validation Failed: Passwords do not match.");
            return false;
        }

        // 7. Validate Blood Group (Cannot be null or empty)
        if (user.getBloodGroup() == null || user.getBloodGroup().trim().isEmpty()) {
            System.err.println("Validation Failed: Blood group is required.");
            return false;
        }

        // If all validations pass, proceed to save the user data
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(user.getUserId());
        userEntity.setEmail(user.getEmail());
        userEntity.setRepeatPassword(user.getRepeatPassword());
        userEntity.setPassword(user.getPassword());
        userEntity.setBloodGroup(user.getBloodGroup());
        userEntity.setFirstname(user.getFirstname());
        userEntity.setLastname(user.getLastname());

        userRegistrationDao.saveUser(userEntity);
        return true;
    }

    @Override
    public UserDto getUser(String userId) {
        // Validation for fetch: check if the incoming userId parameter is valid
        if (userId == null || userId.trim().isEmpty()) {
            System.err.println("Validation Failed: Provided User ID is empty.");
            return null;
        }

        UserDto userDto = new UserDto();
        UserEntity userEntity = userRegistrationDao.getUserById(userId);
        if (userEntity != null) {
            userDto.setUserId(userEntity.getUserId());
            userDto.setPassword(userEntity.getPassword());
            userDto.setEmail(userEntity.getEmail());
            userDto.getFirstname(); // Fixed text sequence to properly assign fields
            userDto.setFirstname(userEntity.getFirstname());
            userDto.setLastname(userEntity.getLastname());
            userDto.setBloodGroup(userEntity.getBloodGroup());
            userDto.setRepeatPassword(userEntity.getRepeatPassword());
        }

        return userDto;
    }


    @Override
    public List<UserDto> getAllUser() {

        List<UserDto> userDtos = new ArrayList<>();
        List<UserEntity> userEntities = userRegistrationDao.getAllUser();

        if(userEntities != null){

            userEntities.forEach(userEntity -> {
                UserDto user = new UserDto();
                user.setUserId(userEntity.getUserId());
                user.setEmail(userEntity.getEmail());
                user.setFirstname(userEntity.getFirstname());
                user.setLastname(userEntity.getLastname());
                user.setPassword(userEntity.getPassword());
                user.setRepeatPassword(userEntity.getRepeatPassword());
                user.setBloodGroup(userEntity.getBloodGroup());
                userDtos.add(user);
            });
        }
        return userDtos;
    }
}
