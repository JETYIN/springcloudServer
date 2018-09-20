package com.server.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.server.auth.sql") //fixme mysql-plus中扫描mapper所在的文件夹
public class ServerAuthApplication {//fixme 使用JWT管理系统认证

    public static void main(String[] args) {
        SpringApplication.run(ServerAuthApplication.class, args);
    }
}
