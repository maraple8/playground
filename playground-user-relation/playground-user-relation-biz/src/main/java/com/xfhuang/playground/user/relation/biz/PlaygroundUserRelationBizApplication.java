package com.xfhuang.playground.user.relation.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.xfhuang.playground.user.relation.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.xfhuang.playground")
public class PlaygroundUserRelationBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundUserRelationBizApplication.class, args);
    }

}
