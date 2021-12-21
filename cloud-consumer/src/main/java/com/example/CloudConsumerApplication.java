package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author : zhangqing
 * @date : 2021/12/18 下午9:41
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerApplication.class, args);
    }


    /**
     * 实例化 RestTemplate 实例
     */
    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }

}

