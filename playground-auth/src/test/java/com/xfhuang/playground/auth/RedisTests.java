package com.xfhuang.playground.auth;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


@SpringBootTest
@Slf4j
class RedisTests {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    void testSetKeyValue() {
        redisTemplate.opsForValue().set("name", "犬小哈");
    }


    @Test
    void testHasKey() {
        log.info("key 是否存在：{}", Boolean.TRUE.equals(redisTemplate.hasKey("name")));
    }


    @Test
    void testGetValue() {
        log.info("value 值：{}", redisTemplate.opsForValue().get("name"));
    }


    @Test
    void testDelete() {
        redisTemplate.delete("name");
    }



}
