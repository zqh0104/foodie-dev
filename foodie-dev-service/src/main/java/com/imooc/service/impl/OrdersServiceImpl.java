package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.OrdersMapper;
import com.imooc.pojo.Orders;
import com.imooc.service.OrdersService;
import org.springframework.stereotype.Service;

/**
 * 订单表;(Orders)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:25
 */
@Service("ordersService")
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

}