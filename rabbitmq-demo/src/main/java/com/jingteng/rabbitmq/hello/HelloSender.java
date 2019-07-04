package com.jingteng.rabbitmq.hello;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: jingteng
 * @date: 2019/7/4 16:31
 */
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendHello(){
        String context = "hello" + new Date();
        System.out.println("发送消息： "+context);
        this.amqpTemplate.convertAndSend("hello",context);
    }
}
