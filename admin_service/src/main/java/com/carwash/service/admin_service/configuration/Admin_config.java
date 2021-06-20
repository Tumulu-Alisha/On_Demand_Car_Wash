package com.carwash.service.admin_service.configuration;

import org.springframework.context.annotation.*;
import springfox.documentation.spi.*;
import springfox.documentation.spring.web.plugins.*;
import springfox.documentation.swagger2.annotations.*;

@Configuration
@EnableSwagger2

public class Admin_config {
     @Bean
	  public Docket api() {
	  return new Docket(DocumentationType.SWAGGER_2);
	    }	
}
