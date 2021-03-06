package com.vrp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RoutingApplication {

    @GetMapping("/message")
    public String message(){
        return "Congrats ! your application deployed successfully in Azure Platform. !";
    }

    public static void main(String[] args) {
        SpringApplication.run(RoutingApplication.class, args);
    }

}
