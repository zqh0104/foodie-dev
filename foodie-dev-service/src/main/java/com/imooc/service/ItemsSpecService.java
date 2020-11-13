package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.ItemsSpec;

/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计(ItemsSpec)表服务接口
 *
 * @author 张启航
 * @since 2020-11-13 17:09:11
 */
public interface ItemsSpecService extends IService<ItemsSpec> {

}