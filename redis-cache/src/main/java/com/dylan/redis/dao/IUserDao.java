package com.dylan.redis.dao;

import com.dylan.redis.common.pojo.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * Created by Administrator on 2018/8/14.
 */
public interface IUserDao {//// FIXME: 2018/8/15 redis数据处理保存与获取将在dao层


    @Select("SELECT * FROM USERINFO WHERE username=#{username}")
    @Cacheable(value="first_redis")//加入缓存
    List<Student> getStudentByUsername(String username);


}
