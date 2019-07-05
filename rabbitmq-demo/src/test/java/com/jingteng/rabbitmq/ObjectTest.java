package com.jingteng.rabbitmq;

import com.jingteng.rabbitmq.object.JingTeng;
import com.jingteng.rabbitmq.object.ObjectSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: jingteng
 * @date: 2019/7/4 18:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {
    @Autowired
    private ObjectSender sender;
    @Test
    public void send(){
        JingTeng jingTeng = new JingTeng();
        jingTeng.setAge(27);
//        jingTeng.setDesc("我被拖欠工资了！！！！！");
        jingTeng.setSex(new Byte("0"));
        sender.send(jingTeng);
    }
}
