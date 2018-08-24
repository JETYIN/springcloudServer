package com.work.dylan.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient

public class ServerGateApplication {//FIXME 此moudle作为网关(Zuul网关)，所有请求将会进入此port

	public static void main(String[] args) {
		SpringApplication.run(ServerGateApplication.class, args);
	}
}
