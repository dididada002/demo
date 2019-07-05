package com.jingteng.rabbitmq.object;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: jingteng
 * @date: 2019/7/4 18:20
 */
@Data
public class JingTeng implements Serializable {
    private Integer age;
    private Byte sex;
}
