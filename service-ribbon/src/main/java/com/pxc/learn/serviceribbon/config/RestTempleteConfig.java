package com.pxc.learn.serviceribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @author: pengxincheng
 * @date: 2019-06-13 17:51
 */
@Configuration
public class RestTempleteConfig {

    @Bean
    @LoadBalanced
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
