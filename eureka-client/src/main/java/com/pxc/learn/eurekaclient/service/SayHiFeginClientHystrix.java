package com.pxc.learn.eurekaclient.service;

import com.pxc.learn.eurekaclient.fegin.SayHiFeginClient;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author: pengxincheng
 * @date: 2019-06-20 16:23
 */
@Component
public class SayHiFeginClientHystrix implements SayHiFeginClient {

    @Override
    public String sayHi2(String name) {
        return "SayHiFeginClient error";
    }
}
