package com.xworkz.spotify.dao;

import com.xworkz.spotify.entity.UserEntity;

public interface UserRegistrationDao {
    boolean saveUser(UserEntity user);
    UserEntity getUser(int id);

}
