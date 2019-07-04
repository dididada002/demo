package com.jingteng.rabbitmq;

import com.jingteng.rabbitmq.hello.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: jingteng
 * @date: 2019/7/4 16:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {
    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello(){
        helloSender.sendHello();
    }
}
