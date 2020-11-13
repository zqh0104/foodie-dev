package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.ItemsParamMapper;
import com.imooc.pojo.ItemsParam;
import com.imooc.service.ItemsParamService;
import org.springframework.stereotype.Service;

/**
 * 商品参数 (ItemsParam)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:24
 */
@Service("itemsParamService")
public class ItemsParamServiceImpl extends ServiceImpl<ItemsParamMapper, ItemsParam> implements ItemsParamService {

}