package com.jingteng.rabbitmq.object;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: jingteng
 * @date: 2019/7/4 18:19
 */
@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(JingTeng jingTeng){
        String context = "jingTeng" + jingTeng;
        System.out.println("发送消息： "+jingTeng);
        this.amqpTemplate.convertAndSend("jingTeng",context);
    }
}
