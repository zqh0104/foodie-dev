package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.OrderItemsMapper;
import com.imooc.pojo.OrderItems;
import com.imooc.service.OrderItemsService;
import org.springframework.stereotype.Service;

/**
 * 订单商品关联表 (OrderItems)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:24
 */
@Service("orderItemsService")
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItems> implements OrderItemsService {

}