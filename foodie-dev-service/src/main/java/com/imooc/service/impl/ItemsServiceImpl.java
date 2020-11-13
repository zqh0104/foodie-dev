package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.ItemsMapper;
import com.imooc.pojo.Items;
import com.imooc.service.ItemsService;
import org.springframework.stereotype.Service;

/**
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表(Items)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:24
 */
@Service("itemsService")
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, Items> implements ItemsService {

}