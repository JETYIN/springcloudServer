package com.dylan.redis.service.impl;

import com.dylan.redis.common.pojo.Student;
import com.dylan.redis.dao.IUserDao;
import com.dylan.redis.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by Administrator on 2018/8/14.
 */
public class IuserImpl implements IUser {


    @Autowired
    public IUserDao userDao;

    @Cacheable(value = "first_redis", key = "myKey")//FIXME: 2018/8/14 设置redis数据来源:开启名称为first_redis缓存池，获取键名为mykey的value值
    @Override
    public List<Student> getAllUser(String userName) {
        System.out.print("打印此语句则说明没有从redis中取数据");
        return userDao.getStudentByUsername(userName);
    }
}
