package com.zhx.springcloud.demofeignuser.controller;

import com.zhx.springcloud.demofeignuser.feignclients.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private CarService carService;


    @RequestMapping("/test/app")
    public String testApp(){
        return "hello, I'm ok";
    }

    @RequestMapping("/user/carNo")
    public String getUserCarNo(String userId, Integer sleepTime){
        return carService.getCarNo(userId, sleepTime);
    }
}
