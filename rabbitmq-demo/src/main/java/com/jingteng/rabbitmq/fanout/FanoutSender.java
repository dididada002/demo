package com.jingteng.rabbitmq.fanout;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: jingteng
 * @date: 2019/9/6 15:22
 */
@Component
public class FanoutSender {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    public void send(){
        String context ="hi,fanout msg:";
        System.out.println("Fanout Send : "+context);

        this.rabbitmqTemplate.convertAndSend("fanoutExchange","",context);
    }
}
