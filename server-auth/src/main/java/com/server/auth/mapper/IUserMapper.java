package com.server.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.server.auth.model.User;
import org.apache.ibatis.annotations.Param;

/***
 * 用户认证与鉴权
 */
public interface IUserMapper extends BaseMapper<User> {

    //fixme 获取用户信息--userName
    User getUserInfoByUserName(@Param("userName") String userName);


}
