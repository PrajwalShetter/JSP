package com.xworkz.bloodapp.Dao;

import com.xworkz.bloodapp.entity.UserEntity;

import java.util.List;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUserById(int userId);
    List<UserEntity> getAllUser();
    int deleteUser(int id);
    boolean updateAccount(UserEntity user);
}
