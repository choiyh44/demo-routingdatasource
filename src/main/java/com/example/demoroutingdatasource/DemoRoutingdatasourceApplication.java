package com.example.demoroutingdatasource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demoroutingdatasource.app")
public class DemoRoutingdatasourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRoutingdatasourceApplication.class, args);
    }

}
