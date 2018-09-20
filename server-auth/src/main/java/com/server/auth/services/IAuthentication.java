package com.server.auth.services;

import com.server.auth.jwt.pojo.JwtAuthRequestPojo;

public interface IAuthentication {


    String login(JwtAuthRequestPojo jwtLoginRequestPojo) throws Exception;

    String refreshToken(String oldToken) throws Exception;

    void invalidToken() throws Exception;
}
