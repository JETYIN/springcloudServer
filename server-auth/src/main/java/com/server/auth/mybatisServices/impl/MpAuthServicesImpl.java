package com.server.auth.mybatisServices.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.server.auth.mapper.IUserMapper;
import com.server.auth.model.User;
import com.server.auth.mybatisServices.IMpAuthServices;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Iservice:继承自IService--根据业务实现需求有时需要公用分享数据
 */
public class MpAuthServicesImpl extends ServiceImpl<IUserMapper, User> implements IMpAuthServices {

    @Autowired
    public IUserMapper userMapper;

    @Override
    public User getUserInfoByUserName(String userName) {

        return userMapper.getUserInfoByUserName(userName);
    }
}
