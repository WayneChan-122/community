package com.cwq.springbootcommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.cwq.springbootcommunity.mapper")
public class SpringbootCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCommunityApplication.class, args);
    }

}
