package com.dream7788.spring.cloud.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHaApplication.class, args);
    }
}
