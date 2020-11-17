package com.imooc.controller;

import com.imooc.service.StuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private StuService stuService;

    @GetMapping("hello")
    public Object hello(){

        logger.info("info:hello~");
        logger.debug("debug:hello~");
        logger.error("error:hello~");
        logger.warn("warn:hello~");
        return "hello world";
    }

    @PostMapping("saveStu")
    public Object saveStu(){
        stuService.saveStu();
        return "OK";
    }
}
