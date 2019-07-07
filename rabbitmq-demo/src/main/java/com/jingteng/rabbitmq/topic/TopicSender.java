package com.jingteng.rabbitmq.topic;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: jingteng
 * @date: 2019/7/7 19:36
 */
@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate template;

    public void send(){
        String context = "hi,i am message all";
        System.out.println("Sender : "+context);
        this.template.convertAndSend("topicExchange","topic.1",context);
    }

    public void send1(){
        String context = "hi,i am message 1";
        System.out.println("Sender : "+context);
        this.template.convertAndSend("topicExchange","topic.message",context);
    }

    public void send2(){
        String context = "hi,i am message 2";
        System.out.println("Sender : "+context);
        this.template.convertAndSend("topicExchange","topic.messages",context);
    }
}
