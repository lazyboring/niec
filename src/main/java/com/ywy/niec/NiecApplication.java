package com.ywy.niec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.ywy.niec.mapper"})
public class NiecApplication {

    public static void main(String[] args) {
        SpringApplication.run(NiecApplication.class, args);
    }

}
