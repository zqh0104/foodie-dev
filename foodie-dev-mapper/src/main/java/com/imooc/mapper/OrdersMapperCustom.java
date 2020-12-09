package com.imooc.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.vo.MyOrdersVO;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface OrdersMapperCustom {

    public Page<MyOrdersVO> queryMyOrders(@Param("paramsMap") Map<String, Object> map, Page page);

    public int getMyOrderStatusCounts(@Param("paramsMap") Map<String, Object> map);

    public Page<OrderStatus> getMyOrderTrend(@Param("paramsMap") Map<String, Object> map,Page page);

}
