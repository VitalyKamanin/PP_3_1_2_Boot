package com.example.pp_3_1_2_boot.service;

import com.example.pp_3_1_2_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User findOne(int id);

    void save(User user);

    User update(User user);

    void delete(int id);
}
