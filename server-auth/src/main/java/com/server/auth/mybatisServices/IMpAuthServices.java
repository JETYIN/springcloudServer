package com.server.auth.mybatisServices;

import com.baomidou.mybatisplus.extension.service.IService;
import com.server.auth.model.User;

public interface IMpAuthServices extends IService<User> {

    User getUserInfoByUserName(String userName);//查询用户信息

}
