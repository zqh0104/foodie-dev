package com.imooc.controller;

import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: QiHangZhang
 * @Date: 2020/10/30 11:30
 * @Description:
 */

@RestController
public class HelloController {

    @Autowired
    private StuService stuService;

    @GetMapping("hello")
    public Object hello(){
        return "hello world";
    }

    @GetMapping("getStu")
    public Object getStu(){
        return null;
    }
}
