package com.carwash.service.washing_package_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.*;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.context.annotation.*;
import org.springframework.web.client.*;

@EnableEurekaClient
@SpringBootApplication
public class WashingPackageServiceApplication {

	@Bean
	@LoadBalanced
    public RestTemplate template(){
    	return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(WashingPackageServiceApplication.class, args);
	}

}
