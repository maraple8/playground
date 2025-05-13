package com.xfhuang.playground.auth.alarm.impl;

import com.xfhuang.playground.auth.alarm.AlarmInterface;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class MailAlarmHelper implements AlarmInterface {

    
    @Override
    public boolean send(String message) {
        log.info("==> 【邮件告警】：{}", message);

        // 业务逻辑...

        return true;
    }
}
