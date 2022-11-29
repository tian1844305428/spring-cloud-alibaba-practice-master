package com.alibaba.cloud.youxia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UseSpringBootConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(UseSpringBootConsumeApplication.class, args);
    }
}
