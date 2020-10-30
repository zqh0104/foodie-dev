package com.imooc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: QiHangZhang
 * @Date: 2020/10/30 11:30
 * @Description:
 */

@RestController
public class HelloController {

    @GetMapping("hello")
    public Object hello(){
        return "hello world";
    }
}
