package com.george.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigurationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigurationServerApplication.class, args);
	}

}
