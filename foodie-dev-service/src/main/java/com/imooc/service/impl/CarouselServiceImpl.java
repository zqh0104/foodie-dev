package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.CarouselMapper;
import com.imooc.pojo.Carousel;
import com.imooc.service.CarouselService;
import org.springframework.stereotype.Service;

/**
 * 轮播图 (Carousel)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:22
 */
@Service("carouselService")
public class CarouselServiceImpl extends ServiceImpl<CarouselMapper, Carousel> implements CarouselService {

}