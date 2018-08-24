package com.dylan.redis.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/8/14.
 */
public class RedisServices {//// FIXME: 2018/8/14 redis服务中心，进行存取数据操作

    @Autowired
    public RestTemplate restTemplate;


}
