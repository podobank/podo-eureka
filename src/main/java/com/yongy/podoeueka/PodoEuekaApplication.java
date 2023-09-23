package com.yongy.podoeueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PodoEuekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PodoEuekaApplication.class, args);
	}

}
