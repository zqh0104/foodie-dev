package com.imooc.commom.enums;

/**
 * @Author: 张启航
 * @Date: 2020/11/14  20:03
 * @Description: 是否枚举
 */
public enum YesOrNo {
    NO(0,"否"),
    YES(1,"是");

    public final Integer type;
    public final String value;

    YesOrNo(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
