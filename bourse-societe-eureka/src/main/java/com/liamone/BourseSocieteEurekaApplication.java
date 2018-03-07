package com.liamone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class BourseSocieteEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BourseSocieteEurekaApplication.class, args);
	}
}
