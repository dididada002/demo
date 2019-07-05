package com.jingteng.rabbitmq.object;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: jingteng
 * @date: 2019/7/4 18:39
 */
@Component
@RabbitListener(queues = "jingTeng")
public class ObjectReceiver {

    @RabbitHandler
    public void process(JingTeng jignteng){
        System.out.println("接受消息 jingTeng： "+jignteng);
    }
}
