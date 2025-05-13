package com.xfhuang.playground.note.biz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.xfhuang.playground.note.biz.domain.mapper")
@EnableFeignClients(basePackages = "com.xfhuang.playground")
public class PlaygroundNoteBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundNoteBizApplication.class, args);
    }

}
