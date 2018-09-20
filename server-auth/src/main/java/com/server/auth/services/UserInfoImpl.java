package com.server.auth.services;


import com.server.auth.model.User;
import com.server.auth.mybatisServices.IMpAuthServices;
import lombok.extern.slf4j.Slf4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 从数据库获取当前用户的信息，查询比对用户信息
 */
@Slf4j
@Service
public class UserInfoImpl {

    @Autowired
    public IMpAuthServices iMpAuthServices;

    public User getUserInfoByUserName(String userName) {//数据库查询数据
        log.info("getUserInfoByUserName run,userName:" + userName);

        return iMpAuthServices.getUserInfoByUserName(userName);
    }

}
