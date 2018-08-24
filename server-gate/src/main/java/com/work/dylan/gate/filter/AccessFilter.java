package com.work.dylan.gate.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Created by Administrator on 2018/8/6.
 */

public class AccessFilter implements GlobalFilter {//FIXME 网关设置过滤器，如需求附带token或是在此处处理权限相关的操作
    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange, GatewayFilterChain gatewayFilterChain) {

        return null;
    }
}
