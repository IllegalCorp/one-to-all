package com.app.service;

import com.app.dao.UserDao;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    @Autowired
    private UserDao userDao;

    public List<User> allUsers() {
        return userDao.getUsers();
    }
}
