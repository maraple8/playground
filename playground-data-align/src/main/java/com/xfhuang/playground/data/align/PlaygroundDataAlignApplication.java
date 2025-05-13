package com.xfhuang.playground.data.align;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.xfhuang.playground.data.align.domain.mapper")
@EnableFeignClients(basePackages = "com.xfhuang.playground")
public class PlaygroundDataAlignApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundDataAlignApplication.class, args);
    }

}
