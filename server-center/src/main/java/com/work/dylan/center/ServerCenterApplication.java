package com.work.dylan.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServerCenterApplication {//FIXME 作为服务中心，在网关中开启

	public static void main(String[] args) {
		SpringApplication.run(ServerCenterApplication.class, args);
	}
}
