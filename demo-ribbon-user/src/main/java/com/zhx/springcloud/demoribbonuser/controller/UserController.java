package com.zhx.springcloud.demoribbonuser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/car/time")
    public String getTimeOfCar(){
        System.out.println("invoker.....");
        return restTemplate.getForEntity("http://service-ribbon-car/car/time", String.class).getBody();
    }


    @RequestMapping("/time")
    public String getTime(){
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello..........");
        return "2018/09/18";
    }


}
