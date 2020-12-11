package com.imooc.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: 张启航
 * @Date: 2020/11/24 16:31
 * @Description: RestTemplate配置类
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // 实现静态资源的映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
                .addResourceLocations("file:/workspaces/images/") // 映射本地静态资源
                .addResourceLocations("classpath:/META-INF/resources/");    // 映射swagger2
//        registry.addResourceHandler("/swagger-ui/**")
//                .addResourceLocations("classpath:/META-INF/resources/webjars/springfox-swagger-ui/");
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
