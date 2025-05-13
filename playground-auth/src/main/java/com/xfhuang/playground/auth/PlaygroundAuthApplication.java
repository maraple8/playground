package com.xfhuang.playground.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.xfhuang.playground")
public class PlaygroundAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlaygroundAuthApplication.class, args);
    }

}
