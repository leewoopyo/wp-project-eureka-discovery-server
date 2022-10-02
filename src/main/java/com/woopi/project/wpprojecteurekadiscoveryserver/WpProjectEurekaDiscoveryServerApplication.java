package com.woopi.project.wpprojecteurekadiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WpProjectEurekaDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WpProjectEurekaDiscoveryServerApplication.class, args);
	}

}
