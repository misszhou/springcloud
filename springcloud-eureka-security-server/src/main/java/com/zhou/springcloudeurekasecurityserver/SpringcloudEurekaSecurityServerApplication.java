package com.zhou.springcloudeurekasecurityserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication

public class SpringcloudEurekaSecurityServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaSecurityServerApplication.class, args);
    }

}
