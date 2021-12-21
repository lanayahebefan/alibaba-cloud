package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * gateWay
 * @author : zhangqing
 * @date : 2021/12/15 下午5:11
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayApplication.class, args);
    }

}
