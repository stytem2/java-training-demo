package com.lz.demo.demos.web;

import com.lz.demo.demos.interceptor.IdemInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lizhi
 * @create 2024-01-31
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {

//    @Autowired
//    IdemInterceptor interceptor;
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(interceptor)
//                .addPathPatterns("/**") ;//拦截路径
//    }
}
