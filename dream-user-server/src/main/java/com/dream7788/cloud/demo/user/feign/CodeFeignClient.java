package com.dream7788.cloud.demo.user.feign;

import com.dream7788.cloud.code.model.CodeDO;
import com.dream7788.cloud.common.response.BaseResponse;
import com.dream7788.cloud.demo.user.feign.fallback.CodeFeignClientFallbackFacoty;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 编码 FeignClient
 */
@FeignClient(value = "dream-code-server", fallbackFactory = CodeFeignClientFallbackFacoty.class)
public interface CodeFeignClient {

    @RequestMapping(value = "/code/getId", method = RequestMethod.GET)
    public BaseResponse<Long> getId();

    @RequestMapping(value = "/code/getCode", method = RequestMethod.GET)
    public BaseResponse<CodeDO> getCode(@RequestParam("codeType") Integer codeType);

    @RequestMapping(value = "/code/saveCode", method = RequestMethod.POST)
    public BaseResponse saveCode(@RequestBody CodeDO codeDO);
}
