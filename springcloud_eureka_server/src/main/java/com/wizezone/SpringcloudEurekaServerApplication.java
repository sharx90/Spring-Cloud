package com.wizezone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
    }


}
