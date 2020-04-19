package com.son.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LE_EurekaMain {
    public static void main(String[] args) {
        SpringApplication.run(LE_EurekaMain.class, args);
    }
}
