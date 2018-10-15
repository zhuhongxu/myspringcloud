package com.zhx.springcloud.demofeignuser.feignclients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-feign-car")
public interface CarService {


    @RequestMapping("/car/carNo")
    String getCarNo(@RequestParam("userId") String userId, @RequestParam("sleepTime") Integer sleepTime);
}
