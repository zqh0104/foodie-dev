package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.ItemsImgMapper;
import com.imooc.pojo.ItemsImg;
import com.imooc.service.ItemsImgService;
import org.springframework.stereotype.Service;

/**
 * 商品图片 (ItemsImg)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:24
 */
@Service("itemsImgService")
public class ItemsImgServiceImpl extends ServiceImpl<ItemsImgMapper, ItemsImg> implements ItemsImgService {

}