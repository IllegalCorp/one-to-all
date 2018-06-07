package com.app.dao;

import com.app.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

  final ConnectionDao connectionDao;

  private User user;
  private List<User> users;

  @Autowired
  public UserDao(ConnectionDao connectionDao) {
    this.connectionDao = connectionDao;
  }

  public User getUser(String id) {
    return connectionDao.getDatabase().find(User.class, id);
  }

  public List<User> getUsers() {
    return null;
  }
}
