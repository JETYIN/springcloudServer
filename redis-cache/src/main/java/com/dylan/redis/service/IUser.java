package com.dylan.redis.service;

import com.dylan.redis.common.pojo.Student;

import java.util.List;

/**
 * Created by Administrator on 2018/8/14.
 */
public interface IUser {


    public List<Student> getAllUser(String userName);
}
