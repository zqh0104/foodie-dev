package com.imooc.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.pojo.OrderStatus;
import com.imooc.pojo.vo.MyOrdersVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrdersMapperCustom {

    public Page<MyOrdersVO> queryMyOrders(@Param("paramsMap") Map<String, Object> map, Page page);

    public int getMyOrderStatusCounts(@Param("paramsMap") Map<String, Object> map);

    public List<OrderStatus> getMyOrderTrend(@Param("paramsMap") Map<String, Object> map);

}
