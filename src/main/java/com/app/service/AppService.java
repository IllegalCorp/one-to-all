package com.app.service;

import com.app.dao.ConnectionDao;
import com.app.dao.UserDao;
import com.app.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {

  @Autowired
  private UserDao userDao;

  @Autowired
  private ConnectionDao connectionDao;

  public User getUser(String id) {
    return userDao.getUser(id);
  }

  public List<User> allUsers() {
    return userDao.getUsers();
  }

  public String getConnectionInfo() {
    return connectionDao.checkConnection();
  }
}
