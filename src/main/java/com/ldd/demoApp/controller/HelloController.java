package com.ldd.demoApp.controller;

import com.ldd.demoApp.dto.UserDTO;
import com.ldd.demoApp.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    UserService userService;

    @GetMapping("/world")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/allUsers")
    public List<UserDTO> getALlUsers(){
        return userService.getAllUsers();
    }
}
