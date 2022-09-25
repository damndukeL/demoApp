package com.ldd.demoApp.mapper;

import com.ldd.demoApp.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void testSelect(){
        System.out.println("Select all method test ------------");
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

}