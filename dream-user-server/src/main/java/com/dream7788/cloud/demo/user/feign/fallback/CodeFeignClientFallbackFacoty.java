package com.dream7788.cloud.demo.user.feign.fallback;

import com.dream7788.cloud.code.model.CodeDO;
import com.dream7788.cloud.common.response.BaseResponse;
import com.dream7788.cloud.demo.user.feign.CodeFeignClient;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CodeFeignClientFallbackFacoty implements FallbackFactory<CodeFeignClient> {

    private static final Logger log = LoggerFactory.getLogger(CodeFeignClientFallbackFacoty.class);

    @Override
    public CodeFeignClient create(Throwable cause) {
        return new CodeFeignClient() {
            @Override
            public BaseResponse<Long> getId() {
                CodeFeignClientFallbackFacoty.log.info("fall back; reason was:", cause);
                BaseResponse<Long> response = new BaseResponse<Long>();
                response.setSuccess(false);
                response.setMsg("系统繁忙，请您稍后再试。");
                return response;
            }

            @Override
            public BaseResponse<CodeDO> getCode(Integer codeType) {
                CodeFeignClientFallbackFacoty.log.info("fall back; reason was:", cause);
                BaseResponse<CodeDO> response = new BaseResponse<CodeDO>();
                response.setSuccess(false);
                response.setMsg("系统繁忙，请您稍后再试。");
                return response;
            }

            @Override
            public BaseResponse saveCode(CodeDO codeDO) {
                CodeFeignClientFallbackFacoty.log.info("fall back; reason was:", cause);
                BaseResponse response = new BaseResponse();
                response.setSuccess(false);
                response.setMsg("系统繁忙，请您稍后再试。");
                return response;
            }
        };
    }
}
