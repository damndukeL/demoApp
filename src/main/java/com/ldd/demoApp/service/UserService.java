package com.ldd.demoApp.service;

import com.ldd.demoApp.dto.UserDTO;
import com.ldd.demoApp.entity.User;

import java.util.List;

public interface UserService {

    List<UserDTO> getAllUsers();
}
