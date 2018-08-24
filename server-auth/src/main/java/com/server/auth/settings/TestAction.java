package com.server.auth.settings;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/8/15.
 */
@Controller
@RequestMapping(value = "/student")
public class TestAction {

    @RequestMapping(value = "/login")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }
}
