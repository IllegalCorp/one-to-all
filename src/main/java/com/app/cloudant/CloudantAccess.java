package com.app.cloudant;

import com.cloudant.client.api.ClientBuilder;
import com.cloudant.client.api.CloudantClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CloudantAccess {

  private static final String DATASOURCE_PATH = "src/main/java/com/app/properties/datasource.ini";

  protected Properties loadProps() {
    Properties prop = new Properties();
    try {
      prop.load(new FileInputStream(new File(DATASOURCE_PATH)));
    } catch (IOException e) {
      throw new RuntimeException("Can't load datasource file. File isn't found.");
    }
    return prop;
  }

  public CloudantClient getClient() {
    return ClientBuilder.account(loadProps().getProperty("ACCOUNT"))
        .username(loadProps().getProperty("USERNAME"))
        .password(loadProps().getProperty("PASSWORD"))
        .build();
  }
}
