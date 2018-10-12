package com.zhx.springcloud.demohystrixuserphone.hystrixcommand;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

public class GetCarTimeCommand1 extends HystrixCommand<String> {

    private RestTemplate restTemplate;

    private Integer sleepTime;

    public GetCarTimeCommand1(RestTemplate restTemplate, Integer sleepTime) {
        super(HystrixCommand.Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("carService")));
        this.restTemplate = restTemplate;
        this.sleepTime = sleepTime;
    }

    @Override
    protected String run() throws Exception {
        return restTemplate.getForEntity("http://service-hystrix-car/car/time?sleepTime=" + sleepTime , String.class).getBody();
    }

    @Override
    protected String getFallback() {
        return "command internal error";
    }
}
