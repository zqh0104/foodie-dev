package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.ItemsCommentsMapper;
import com.imooc.pojo.ItemsComments;
import com.imooc.service.ItemsCommentsService;
import org.springframework.stereotype.Service;

/**
 * 商品评价表 (ItemsComments)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:24
 */
@Service("itemsCommentsService")
public class ItemsCommentsServiceImpl extends ServiceImpl<ItemsCommentsMapper, ItemsComments> implements ItemsCommentsService {

}