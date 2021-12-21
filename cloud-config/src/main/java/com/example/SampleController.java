package com.example;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * @author : zhangqing
 * @date : 2021/12/15 下午5:26
 */
@RestController
@RefreshScope
public class SampleController {

    @Value("${user.name}")
    private String userName;

    @Value("${user.age}")
    private int age;


    @RequestMapping("/user")
    public String simple() {
        return "获取 Nacos Config配置如下：" + userName + " " + age + "!";
    }

}
