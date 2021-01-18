package com.imooc.controller;

import com.imooc.commom.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: QiHangZhang
 * @Date: 2020/10/30 11:30
 * @Description:
 */
//@ApiIgnore
@RestController
@RequestMapping("redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisOperator redisOperator;

    @GetMapping("set")
    public Object set(String key,String value){

//        redisTemplate.opsForValue().set(key,value);
        redisOperator.set(key,value);

        return "OK";
    }

    @GetMapping("get")
    public String get(String key){

//        return (String) redisTemplate.opsForValue().get(key);
        return redisOperator.get(key);
    }

    @GetMapping("delete")
    public Object delete(String key){

//        redisTemplate.delete(key);
        redisOperator.del(key);
        return "OK";
    }

}
