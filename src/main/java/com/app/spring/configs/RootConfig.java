package com.app.spring.configs;

import com.app.cloudant.CloudantAccess;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {

  @Bean
  public CloudantAccess cloudantClient() {
    CloudantAccess cloudantAccess = new CloudantAccess();
    return cloudantAccess;
  }
}
