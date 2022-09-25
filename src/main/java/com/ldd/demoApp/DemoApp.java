package com.ldd.demoApp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldd.demoApp.mapper")
public class DemoApp {
    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class);
    }
}
