package com.baidu.springbootstarter.service;

import com.baidu.springbootstarter.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findById(int id);
    List<User> findAll();
}
