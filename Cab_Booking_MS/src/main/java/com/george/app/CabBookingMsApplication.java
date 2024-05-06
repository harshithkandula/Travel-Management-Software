package com.george.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@EnableJpaRepositories
@SpringBootApplication
public class CabBookingMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabBookingMsApplication.class, args);
	}

}
