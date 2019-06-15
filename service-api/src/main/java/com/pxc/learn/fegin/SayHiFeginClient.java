package com.pxc.learn.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description
 * @author: pengxincheng
 * @date: 2019-06-13 20:12
 */
@FeignClient("service-hi")    //指定调用的服务名称
public interface SayHiFeginClient {

    @RequestMapping("/feign/hi")
    String sayHi2(@RequestParam("name") String name);
}
