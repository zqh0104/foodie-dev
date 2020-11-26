package com.test;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author: 张启航
 * @Date: 2020/11/26 9:52
 * @Description:
 */
public class TestMoney {

    @Test
    public void testMoney(){
        Double a = 0.02;
        Double b = 0.03;
        BigDecimal bigDecimal = BigDecimal.valueOf(a);
        System.out.println(a+b);
    }
}
