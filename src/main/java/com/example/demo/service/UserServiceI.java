package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserServiceI {

    //CURD

    //CREATE
    User createUser(User user);

    //UPDATE
    User updateUser(User user,Long userId);

    //GET Single Data
    User getsingleUser(Long userId);

    //GET All data
    List<User> getAllUser();

    //DELETE
    void deleteUser(Long userId);
}

