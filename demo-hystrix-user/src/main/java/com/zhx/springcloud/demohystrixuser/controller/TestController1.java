package com.zhx.springcloud.demohystrixuser.controller;

import com.zhx.springcloud.demohystrixuser.service.TestService1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/user")
public class TestController1 {
    @Resource
    private TestService1 testService1;

    /**
     * HystrixCommand同步执行
     * @return
     */
    @RequestMapping("/car/sync")
    public String HystrixCommandSync(Integer sleepTime){
        sleepTime = sleepTime == null ? 500 : sleepTime;
        return testService1.getCarTimeSync(sleepTime);
    }

    /**
     * HystrixCommand异步执行
     * @return
     */
    @RequestMapping("/car/unsync")
    public String HystrixCommandUnSync(Integer sleepTime){
        sleepTime = sleepTime == null ? 500 : sleepTime;
        try {
            Future<String> stringFuture = testService1.getCarTimeUnSync(sleepTime);
            boolean flag = true;
            while (flag){
                Thread.sleep(100);
                System.out.println("正在执行异步任务");
                if (stringFuture.isDone()){
                    flag = false;
                }
            }
            return stringFuture.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }
}
