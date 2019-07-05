package com.jingteng.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: jingteng
 * @date: 2019/7/4 16:21
 */
@Configuration
public class RabbitmqConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
    @Bean
    public Queue objectQueue(){
        return new Queue("jingTeng");
    }
}
