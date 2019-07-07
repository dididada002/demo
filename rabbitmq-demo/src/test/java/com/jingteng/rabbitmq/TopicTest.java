package com.jingteng.rabbitmq;

import com.jingteng.rabbitmq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: jingteng
 * @date: 2019/7/7 19:48
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TopicTest {
    @Autowired
    private TopicSender topicSender;

    @Test
    public void send(){
        topicSender.send();
    }

    @Test
    public void send1(){
        topicSender.send1();
    }

    @Test
    public void send2(){
        topicSender.send2();
    }
}
