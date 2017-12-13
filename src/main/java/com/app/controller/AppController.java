package com.app.controller;

import com.app.model.User;
import com.app.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class AppController {

    @Autowired
    private AppService appService;

    public @ResponseBody
    List<User> getAllUsers() {
        return appService.allUsers();
    }
}
