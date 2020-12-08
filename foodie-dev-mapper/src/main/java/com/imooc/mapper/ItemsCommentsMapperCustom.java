package com.imooc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.pojo.ItemsComments;
import com.imooc.pojo.vo.MyCommentVO;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface ItemsCommentsMapperCustom extends BaseMapper<ItemsComments> {

    public void saveComments(Map<String, Object> map);

    public Page<MyCommentVO> queryMyComments(@Param("paramsMap") Map<String, Object> map, Page page);

}