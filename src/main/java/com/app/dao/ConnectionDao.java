package com.app.dao;

import com.app.cloudant.CloudantAccess;
import com.cloudant.client.api.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ConnectionDao {

  public static final String CORE_DB_NAME = "main-storage";

  final CloudantAccess cloudantAccess;

  @Autowired
  public ConnectionDao(CloudantAccess cloudantAccess) {
    this.cloudantAccess = cloudantAccess;
  }

  public Database getDatabase() {
    return cloudantAccess.getClient().database(CORE_DB_NAME, false);
  }

  public String checkConnection() {
    Database database = getDatabase();
    if (database == null) {
      throw new RuntimeException("Can't connect to the database. "
          + "There is no such database or connection failed.");
    }
    return database.info().toString();
  }
}
