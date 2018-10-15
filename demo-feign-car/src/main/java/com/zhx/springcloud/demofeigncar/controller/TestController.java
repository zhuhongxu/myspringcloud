package com.zhx.springcloud.demofeigncar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class TestController {

    @RequestMapping("/test/app")
    public String testApp(){
        return "hello, I am ok";
    }

    @RequestMapping("/carNo")
    public String getCarNo(String userId, Integer sleepTime){
        System.out.println("sleepTime is : " + sleepTime);
        return userId + "的车牌号是浙J17638";
    }
}
