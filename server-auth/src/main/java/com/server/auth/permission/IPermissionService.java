package com.server.auth.permission;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2018/8/16.
 */
public interface IPermissionService {//// FIXME: 2018/8/16 此模块应放置于网关中，当用户登录成功后，依据用户的userid去数据库查询对应的模块权限
    
    public boolean hasPermission(HttpServletRequest httpServletRequest, Authentication authentication);
}
