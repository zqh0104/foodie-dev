package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Author: QiHangZhang
 * @Date: 2020/10/30 13:38
 * @Description:
 */

@SpringBootApplication
// 扫描所有包以及相关组件包
@ComponentScan(basePackages = {"com.imooc","org.n3r.idworker"})
//开启定时任务
@EnableScheduling
//开启使用redis作为spring session
@EnableRedisHttpSession
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class,args);
    }
}
