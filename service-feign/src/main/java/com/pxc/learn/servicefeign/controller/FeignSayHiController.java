package com.pxc.learn.servicefeign.controller;

import com.pxc.learn.fegin.SayHiFeginClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description
 * @author: pengxincheng
 * @date: 2019-06-13 20:49
 */
@RestController
public class FeignSayHiController {
    @Resource
    private SayHiFeginClient sayHiFeginClient;


    @GetMapping("test")
    public String sayHi(@RequestParam("name") String name) {
        return sayHiFeginClient.sayHi2(name);
    }
}
