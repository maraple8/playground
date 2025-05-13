package com.xfhuang.playground.user.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.xfhuang.playground.user.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.xfhuang.playground")
public class PlaygroundUserBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundUserBizApplication.class, args);
    }

}
