package com.server.auth.services.impl;

import com.server.auth.jwt.pojo.JwtAuthRequestPojo;

import com.server.auth.model.User;
import com.server.auth.pojo.UserInfo;
import com.server.auth.services.IUserService;
import com.server.auth.services.UserInfoImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    public UserInfoImpl userInfoImpl;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);//fixme 主要用于密码加密与密码匹配操作

    @Override
    public UserInfo validate(JwtAuthRequestPojo authRequestPojo) {//fixme 验证登录传入的UserId或是password是否合法
        UserInfo info = new UserInfo();
        User user = userInfoImpl.getUserInfoByUserName(authRequestPojo.getUsername());//从库中查询到user信息
        if (encoder.matches(authRequestPojo.getPassword(), user.getUser_Password())) {//用户输入的密码和数据库密码做比较
            BeanUtils.copyProperties(user, info);//赋值操作，user的值赋予Userinfo
            info.setId(user.getId().toString());
            log.info("user input password equal sql password");
        }

        return info;
    }
}
