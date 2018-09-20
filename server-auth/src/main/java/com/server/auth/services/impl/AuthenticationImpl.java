package com.server.auth.services.impl;

import com.server.auth.exception.UserInvalidException;
import com.server.auth.jwt.JWTInfo;
import com.server.auth.jwt.JsonTokenUtils;
import com.server.auth.jwt.pojo.JwtAuthRequestPojo;
import com.server.auth.pojo.UserInfo;
import com.server.auth.services.IAuthentication;
import com.server.auth.services.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 验证授权服务生成token
 */
@Service
@Slf4j
public class AuthenticationImpl implements IAuthentication {
    @Autowired
    public IUserService userService;

    @Autowired
    public JsonTokenUtils jsonTokenUtils;

    @Override
    public String login(JwtAuthRequestPojo jwtAuthRequestPojo) throws Exception {//fixme 生成jwtToken并返回前端:userId先去数据查询，查询到userId信息后则生成token返回
        log.info("auth login and create jwtToken to front web");
        //生成token
        UserInfo userInfo = userService.validate(jwtAuthRequestPojo);//FIXME 调用接口
        if (!StringUtils.isEmpty(userInfo.getId())) {//fixme 数据库正确验证到用户键入信息，生成token返回

            return jsonTokenUtils.generateToken(new JWTInfo(userInfo.getUsername(), userInfo.getId() + "", userInfo.getName()));

        }


        throw new UserInvalidException("User does not exist or account password is incorrect!");//抛出异常用户名或密码不正确
    }

    @Override
    public String refreshToken(String oldToken) throws Exception {
        return null;
    }

    @Override
    public void invalidToken() throws Exception {

    }
}
