package com.dream7788.cloud.demo.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试Controller
 */
@RefreshScope
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${spring.datasource.username}")
    private String username;

    @RequestMapping("/sayUserName")
    public String sayUserName() {
        System.out.println(username);
        return username;
    }
}
