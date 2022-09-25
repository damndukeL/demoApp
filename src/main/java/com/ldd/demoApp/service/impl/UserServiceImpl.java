package com.ldd.demoApp.service.impl;

import com.ldd.demoApp.dto.UserDTO;
import com.ldd.demoApp.dto.mapper.UserConvert;
import com.ldd.demoApp.entity.User;
import com.ldd.demoApp.mapper.UserMapper;
import com.ldd.demoApp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userMapper.selectList(null);
        return UserConvert.INSTANCE.convertUserList(users);
    }
}
