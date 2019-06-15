package com.pxc.learn.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author: pengxincheng
 * @date: 2019-06-13 17:25
 */
@Slf4j
@RestController
public class HiController {

    @GetMapping("hi")
    public String sayHi(@RequestParam String name) {
        log.info("name=" + name);
        return "Hi " + name;
    }


    @RequestMapping("/feign/hi")
    String sayHi2(@RequestParam("name") String name) {
        log.info("Feign hi name=" + name);
        return "Hi " + name;
    }
}
