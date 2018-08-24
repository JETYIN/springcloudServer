package com.server.auth.permission.impl;

import com.server.auth.permission.IPermissionService;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/8/16.
 */
public class PermissionServiceImpl implements IPermissionService {

    //Fixme 此处依据登录成功后返回的userid查询对应的用户模块权限


    @Override
    public boolean hasPermission(HttpServletRequest httpServletRequest, Authentication authentication) {

        return false;
    }


}
