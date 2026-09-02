package com.xworkz.apexLog.dao;

import com.xworkz.apexLog.entity.UserEntity;

import java.util.List;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);
    List<UserEntity> getAllUsers();
    boolean deleteAccount(int id);
    boolean updateAccount(UserEntity user);
}
