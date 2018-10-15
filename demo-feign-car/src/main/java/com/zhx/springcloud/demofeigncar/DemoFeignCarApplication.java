package com.zhx.springcloud.demofeigncar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoFeignCarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignCarApplication.class, args);
	}
}
