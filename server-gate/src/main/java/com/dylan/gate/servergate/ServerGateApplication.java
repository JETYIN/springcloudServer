package com.dylan.gate.servergate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableZuulProxy
@EnableFeignClients
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)//fixme 不加此行报错--关闭特定的自动配置
@EnableDiscoveryClient //fixme 网关链接服务中心
@ComponentScan(basePackages = "com.dylan.common.bean")//fixme 网关处注册扫描server-common处的bean
public class ServerGateApplication {//fixme--网关转auth服务

    public static void main(String[] args) {
        SpringApplication.run(ServerGateApplication.class, args);
    }

    //fixme 鉴权中心和zuul整合在网关处，网关判断哪些服务需要token哪些不需要

}