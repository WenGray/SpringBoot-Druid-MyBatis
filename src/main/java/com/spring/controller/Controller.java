package com.spring.controller;

import com.spring.dto.Resp;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建Controller
 *
 * @author Gray
 * @date 2017/5/7
 */
@RestController
@RequestMapping(value = "/api")
public class Controller {

    private final UserService userService;

    @Autowired
    public Controller(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Resp getUsers() {
        return userService.findAll();
    }

}
