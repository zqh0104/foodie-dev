package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.ItemsSpecMapper;
import com.imooc.pojo.ItemsSpec;
import com.imooc.service.ItemsSpecService;
import org.springframework.stereotype.Service;

/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计(ItemsSpec)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:24
 */
@Service("itemsSpecService")
public class ItemsSpecServiceImpl extends ServiceImpl<ItemsSpecMapper, ItemsSpec> implements ItemsSpecService {

}