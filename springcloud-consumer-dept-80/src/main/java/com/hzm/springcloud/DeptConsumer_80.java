package com.hzm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
// Rinbbon 和 eureka整合后，客户端可以直接调用，不用关心ip地址
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_80 {
    public static void main(String[] arg){
        SpringApplication.run(DeptConsumer_80.class,arg);
    }
}
