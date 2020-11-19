package com.imooc.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.pojo.vo.ItemCommentVO;
import com.imooc.pojo.vo.SearchItemsVO;
import com.imooc.pojo.vo.ShopcartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ItemsMapperCustom {

    public Page<ItemCommentVO> queryItemComments(@Param("paramsMap") Map<String, Object> map, Page page);

    public Page<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map, Page page);

    public Page<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap") Map<String, Object> map, Page page);

    public List<ShopcartVO> queryItemsBySpecIds(@Param("paramsList") List specIdsList);

    public int decreaseItemSpecStock(@Param("specId") String specId,
                                     @Param("pendingCounts") int pendingCounts);
}