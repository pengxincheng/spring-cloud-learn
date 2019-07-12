package com.pxc.learn.serviceribbon.controller;

import com.pxc.learn.serviceribbon.service.TestHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @author: pengxincheng
 * @date: 2019-06-13 17:54
 */
@RestController
public class CallHiController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private TestHystrixService testHystrixService;

    @GetMapping("/call/hi")
    public String callHi(@RequestParam("name") String name) {

        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    @GetMapping("/test/ribbon/hystrix")
    public String testHystrix(@RequestParam("name") String name) {

        return testHystrixService.callHi(name);
    }
}
