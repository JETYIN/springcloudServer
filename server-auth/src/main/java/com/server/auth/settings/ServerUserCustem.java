package com.server.auth.settings;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by Administrator on 2018/8/15.
 */
public class ServerUserCustem implements UserDetailsService{//// FIXME: 2018/8/15 设置用户自定义权限设置
    
    
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
