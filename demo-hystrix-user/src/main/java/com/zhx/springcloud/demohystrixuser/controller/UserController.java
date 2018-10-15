package com.zhx.springcloud.demohystrixuser.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    RestTemplate restTemplate;

    /**
     * 一、测试fallback
     * @return
     */
    @RequestMapping("/car/time")
    @HystrixCommand(fallbackMethod = "fallbackm")
    public String getTimeOfCar(Integer sleepTime){
        System.out.println("invoker.....");
        return restTemplate.getForEntity("http://service-hystrix-car/car/time?sleepTime=" + sleepTime, String.class).getBody();
    }
    public String fallbackm(Integer sleepTime){
        System.out.println(sleepTime);
        return "invoke error";
    }

    /**
     * 自定义命令1
     * @return
     */
    public String test2(Integer sleepTime){
        System.out.println(sleepTime);
        return null;
    }







}
