package com.app.dao;

import com.app.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class UserDao {

    private List<User> users = Arrays.asList(
            new User("admin", "admin"),
            new User("guest", "guest"));

    public List<User> getUsers() {
        return users;
    }
}
