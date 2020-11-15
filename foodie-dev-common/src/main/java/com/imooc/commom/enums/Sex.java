package com.imooc.commom.enums;

/**
 * @Author: 张启航
 * @Date: 2020/11/14  20:03
 * @Description: 性别枚举
 */
public enum Sex {
    woman(0,"男"),
    man(1,"女"),
    secret(2,"保密");

    public final Integer type;
    public final String value;

    Sex(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
