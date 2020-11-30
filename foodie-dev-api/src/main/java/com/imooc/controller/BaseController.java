package com.imooc.controller;

import java.io.File;

/**
 * @Author: 张启航
 * @Date: 2020/11/24 14:50
 * @Description:
 */
public class BaseController {

    public static final String FOODIE_SHOPCART = "shopcart";

    // 支付中心的调用地址
    String paymentUrl = "http://payment.t.mukewang.com/foodie-payment/payment/createMerchantOrder";		// produce

    // 微信支付成功 -> 支付中心 -> 天天吃货平台
    //                       |-> 回调通知的url
    String payReturnUrl = "http://sqdhzi.natappfree.cc/orders/notifyMerchantOrderPaid";

    // 用户上传头像的位置
    public static final String IMAGE_USER_FACE_LOCATION = File.separator + "develop" +
            File.separator + "images" +
            File.separator + "foodie" +
            File.separator + "faces";
//    public static final String IMAGE_USER_FACE_LOCATION = "\develop\images\foodie\faces";
}
