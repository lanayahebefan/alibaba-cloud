package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 *
 * @author : zhangqing
 * @date : 2021/12/18 下午9:45
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class CloudSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSentinelApplication.class, args);
    }

    @Bean
//    @SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ExceptionUtil.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

