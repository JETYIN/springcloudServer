package com.server.auth.jwt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * serviice层调用接口生成token
 */
@Component
public class JsonTokenUtils {
    @Value("${jwt.expire}") //fixme 获取application.properties中的token过期时间1h
    private int expire;
    @Autowired
    private KeyConfiguration keyConfiguration;


    public String generateToken(IJWTInfo jwtInfo) throws Exception {
        return JWTHelper.generateToken(jwtInfo, keyConfiguration.getUserPriKey(), expire);
    }

    public IJWTInfo getInfoFromToken(String token) throws Exception {
        return JWTHelper.getInfoFromToken(token, keyConfiguration.getUserPubKey());
    }
}
