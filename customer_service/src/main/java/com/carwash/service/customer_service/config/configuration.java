package com.carwash.service.customer_service.config;

import org.springframework.context.annotation.*;
import springfox.documentation.spi.*;
import springfox.documentation.spring.web.plugins.*;
import springfox.documentation.swagger2.annotations.*;


@Configuration
@EnableSwagger2
public class configuration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2);
    }
}