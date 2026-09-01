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

        if (user == null) {
            System.err.println("Validation Failed: User data cannot be null.");
            return false;
        }

        if (user.getFirstname() == null || user.getFirstname().trim().isEmpty()) {
            System.err.println("Validation Failed: First name is required.");
            return false;
        }

        if (user.getLastname() == null || user.getLastname().trim().isEmpty()) {
            System.err.println("Validation Failed: Last name is required.");
            return false;
        }

        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            System.err.println("Validation Failed: Email is required.");
            return false;
        }
        if (!user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            System.err.println("Validation Failed: Invalid email format.");
            return false;
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.err.println("Validation Failed: Password is required.");
            return false;
        }
        if (user.getPassword().length() < 6) {
            System.err.println("Validation Failed: Password must be at least 6 characters long.");
            return false;
        }

        if (user.getRepeatPassword() == null || !user.getRepeatPassword().equals(user.getPassword())) {
            System.err.println("Validation Failed: Passwords do not match.");
            return false;
        }

        if (user.getBloodGroup() == null || user.getBloodGroup().trim().isEmpty()) {
            System.err.println("Validation Failed: Blood group is required.");
            return false;
        }

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
    public UserDto getUser(int userId) {

        if (userId == 0 ) {
            System.err.println("Validation Failed: Provided User ID is empty.");
            return null;
        }

        UserDto userDto = new UserDto();
        UserEntity userEntity = userRegistrationDao.getUserById(userId);
        if (userEntity != null) {
            userDto.setUserId(userEntity.getUserId());
            userDto.setPassword(userEntity.getPassword());
            userDto.setEmail(userEntity.getEmail());
            userDto.getFirstname();
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

    @Override
    public int deleteUser(int id) {
        return userRegistrationDao.deleteUser(id);
    }


    @Override
    public boolean updateAccount(UserDto userDto) {
        UserEntity user = new UserEntity();

        user.setUserId(userDto.getUserId());
        user.setEmail(userDto.getEmail());
        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setBloodGroup(userDto.getBloodGroup());
        return true;
    }
}
