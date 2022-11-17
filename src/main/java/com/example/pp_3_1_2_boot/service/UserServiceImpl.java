package com.example.pp_3_1_2_boot.service;

import com.example.pp_3_1_2_boot.dao.UserDAO;
import com.example.pp_3_1_2_boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDAO.findOne(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Transactional
    @Override
    public User update(User user) {
        return userDAO.update(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }
}
