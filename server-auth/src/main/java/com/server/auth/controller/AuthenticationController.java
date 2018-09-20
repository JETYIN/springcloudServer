package com.server.auth.controller;

import com.dylan.common.msg.ObjectRestResponse;
import com.dylan.common.pojo.BaseController;
import com.server.auth.services.IAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController extends BaseController {//fixme 授权中心提供token操作

    @Autowired
    public IAuthentication iAuthentication;

    //fixme 获取token接口


}
