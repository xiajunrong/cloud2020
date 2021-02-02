package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("routeId1", r -> r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        routes.route("routeXia", r -> r.path("/xiaju").uri("http://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
