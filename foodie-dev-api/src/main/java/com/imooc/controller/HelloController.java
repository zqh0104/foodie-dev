package com.imooc.controller;

import com.imooc.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Author: QiHangZhang
 * @Date: 2020/10/30 11:30
 * @Description:
 */
@ApiIgnore
@RestController
public class HelloController {

    @Autowired
    private StuService stuService;

    @GetMapping("hello")
    public Object hello(){
        return "hello world";
    }

    @PostMapping("saveStu")
    public Object saveStu(){
        stuService.saveStu();
        return "OK";
    }
}
