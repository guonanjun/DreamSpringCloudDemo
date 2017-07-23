package com.dream7788.cloud.demo.user.controller;

import com.dream7788.cloud.common.response.BaseResponse;
import com.dream7788.cloud.demo.user.feign.CodeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private CodeFeignClient codeFeignClient;

    @RequestMapping("/saveUser")
    public BaseResponse saveUser() {
        BaseResponse response = new BaseResponse();
        BaseResponse<Long> idResponse = codeFeignClient.getId();
        Long id = idResponse.getData();
        //TODO 保存用户信息

        return response;
    }
}
