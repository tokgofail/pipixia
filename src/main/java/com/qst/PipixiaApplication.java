package com.qst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/qst/mapper")
public class PipixiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PipixiaApplication.class, args);
    }

}
