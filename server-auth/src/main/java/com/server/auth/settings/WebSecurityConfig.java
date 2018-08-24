package com.server.auth.settings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by Administrator on 2018/8/15.
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {//fixme spring security oauth2的默认配置ResourceServerConfigurerAdapter,spring security默认配置WebSecurityConfigurerAdapter

    @Bean
    public UserDetailsService custemUserDetailsService() {
        return new ServerUserCustem();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //fixme 其他请求需要认证登录后才能访问，登录页面、注销页面可任意访问--浏览器输出网址将定位到将自动定位到login页面
        System.out.print("spring security configure");
        http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/student/login").defaultSuccessUrl("/student/index").permitAll().and().logout().permitAll();
    }

// FIXME: 2018/8/15 自定义的权限设置configure 必须设置，否则启动服务报错


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(custemUserDetailsService());//FIXME 设置自定义的处理规则
    }
}
