package com.app.controller;

import com.app.model.User;
import com.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private AppService appService;

    @RequestMapping("/{id}")
    public @ResponseBody
    User getUser(@PathVariable String id) {
        return appService.getUser(id);
    }

    @RequestMapping("/users")
    public @ResponseBody
    List<User> getAllUsers() {
        return appService.allUsers();
    }

    @RequestMapping("/con")
    public @ResponseBody
    String getConnectionInfo() {
        return appService.getConnectionInfo();
    }
}
