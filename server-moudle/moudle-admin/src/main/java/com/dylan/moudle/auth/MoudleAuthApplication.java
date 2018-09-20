package com.dylan.moudle.auth;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAdminServer
@SpringBootApplication
public class MoudleAuthApplication {//fixme 使用此作为授权、权限、权限菜单模块

    public static void main(String[] args) {

        SpringApplication.run(MoudleAuthApplication.class, args);
    }
}
