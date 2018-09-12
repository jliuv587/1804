package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringCloudApplication//这里必须是cloud 需要注意
@EnableFeignClients
public class RunAppFeign {
        public static void main(String[] args) {
			SpringApplication.run(RunAppFeign.class, args);
		}
}
