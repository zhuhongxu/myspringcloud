package com.zhx.springcloud.demohystrixuserphone.hystrixcommand;


import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.web.client.RestTemplate;

public class GetCarTimeCommand2 extends HystrixCommand<String> {

    private RestTemplate restTemplate;
    private Integer sleepTime;

    public GetCarTimeCommand2(RestTemplate restTemplate, Integer sleepTime) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("carService2")));
        this.restTemplate = restTemplate;
        this.sleepTime = sleepTime;
    }

    @Override
    protected String run() throws Exception {
        return restTemplate.getForEntity("http://service-hystrix-car/car/time/sleep?sleepTime=" + sleepTime, String.class).getBody();
    }

    @Override
    protected String getFallback() {
        Throwable executionException = getExecutionException();
        executionException.printStackTrace();
        return "command internal error";
    }
}
