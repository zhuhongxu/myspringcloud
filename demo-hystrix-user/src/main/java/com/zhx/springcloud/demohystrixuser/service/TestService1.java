package com.zhx.springcloud.demohystrixuser.service;

import com.zhx.springcloud.demohystrixuser.hystrixcommand.GetCarTimeCommand1;
import com.zhx.springcloud.demohystrixuser.hystrixcommand.GetCarTimeCommand2;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.concurrent.Future;

@Service
public class TestService1 {
    @Resource
    private RestTemplate restTemplate;

    public String getCarTimeSync(Integer sleepTime){
        GetCarTimeCommand1 getCarTimeCommand1 = new GetCarTimeCommand1(restTemplate, sleepTime);
        return getCarTimeCommand1.execute();
    }

    public Future<String> getCarTimeUnSync(Integer sleepTime){
        GetCarTimeCommand2 getCarTimeCommand2 = new GetCarTimeCommand2(restTemplate, sleepTime);
        return getCarTimeCommand2.queue();
    }
}
