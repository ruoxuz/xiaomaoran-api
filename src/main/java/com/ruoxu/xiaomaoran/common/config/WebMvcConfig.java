package com.ruoxu.xiaomaoran.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ruoxu
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 解决跨域的问题
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200");

    }
}
