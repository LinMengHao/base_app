package com.xzkj.baseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.xzkj"})
public class BaseServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseServiceApplication.class, args);
    }

}
