package com.server.auth.services;

import com.server.auth.jwt.pojo.JwtAuthRequestPojo;
import com.server.auth.pojo.UserInfo;

public interface IUserService {

    UserInfo validate(JwtAuthRequestPojo authRequestPojo);//数据库验证userId

}
