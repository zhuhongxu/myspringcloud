package com.zhx.springcloud.demoribboncar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/car")
public class CarController {


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

    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/user/phone/time")
    public String getTimeOfCar(){
        System.out.println("invoker.....");
        return restTemplate.getForEntity("http://service-ribbon-user/user/phone/time", String.class).getBody();
    }
}
