package com.message.dylan.service.impl;

import com.message.dylan.service.IMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/8/17.
 */

@Service
public class IMessageImpl implements IMessage {

    @Autowired
    public AmqpTemplate amqpTemplate;
    private final Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());

    @Override
    public void sendMessage(String key, String content) {

    }
}
