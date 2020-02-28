package com.ys.dl.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ys")
@MapperScan("com.ys.dl.dao.mapper")
public class DlApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DlApiApplication.class, args);
    }

}
