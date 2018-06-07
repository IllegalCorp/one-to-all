package com.app.spring.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Bean
  public UserDetailsService userDetailsService() {
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    manager.createUser(
        User.withUsername("admin")
            .password("superadmin123")
            .roles("ADMIN")
            .build());
    return manager;
  }
}
