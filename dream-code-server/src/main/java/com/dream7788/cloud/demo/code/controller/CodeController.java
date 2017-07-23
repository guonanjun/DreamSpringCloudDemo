package com.dream7788.cloud.demo.code.controller;

import com.dream7788.cloud.code.model.CodeDO;
import com.dream7788.cloud.common.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 编码 Controller
 */
@RequestMapping("/code")
@RestController
public class CodeController {

    private static final Logger log = LoggerFactory.getLogger(CodeController.class);

    @RequestMapping("/getId")
    public BaseResponse<Long> getId() {
        BaseResponse<Long> response = new BaseResponse<>();
        //TODO 获取全局唯一的ID

        return  response;
    }

    @RequestMapping("/getCode")
    public BaseResponse<CodeDO> getCode(@RequestParam("codeType") Integer codeType) {
        BaseResponse<CodeDO> response = new BaseResponse<>();
        //TODO 根据编码类型获取编码

        return response;
    }

    @RequestMapping("/saveCode")
    public BaseResponse saveCode(@RequestBody CodeDO codeDO) {
        BaseResponse response = new BaseResponse<>();
        //TODO 保存新的编码类型

        return response;
    }

}
