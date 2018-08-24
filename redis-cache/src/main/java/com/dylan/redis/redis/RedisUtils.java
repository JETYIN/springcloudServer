package com.dylan.redis.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * Created by Administrator on 2018/8/14.处理redis操作类
 */
public class RedisUtils {

    @Autowired
    public RedisTemplate redisTemplate;

    //删除某个键值
    public void clear(String key) {
        redisTemplate.delete(key);
    }

    //删除所有键值


}
