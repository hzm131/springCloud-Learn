package com.hzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 开启Eureka服务  可以接收别人的注册
public class EurekaServer_7001 {
    public static void main(String[] arg){
        SpringApplication.run(EurekaServer_7001.class,arg);
    }
}
