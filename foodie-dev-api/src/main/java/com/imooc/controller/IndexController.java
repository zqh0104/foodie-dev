package com.imooc.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.commom.enums.YesOrNo;
import com.imooc.commom.utils.IMOOCJSONResult;
import com.imooc.commom.utils.JsonUtils;
import com.imooc.commom.utils.RedisOperator;
import com.imooc.pojo.Carousel;
import com.imooc.pojo.Category;
import com.imooc.pojo.vo.CategoryVO;
import com.imooc.pojo.vo.NewItemsVO;
import com.imooc.service.CarouselService;
import com.imooc.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 轮播图 (Carousel)表控制层
 *
 * @author 张启航
 * @since 2020-11-13 18:07:02
 */
@Api(value = "首页",tags = "首页展示的相关接口")
@RestController
@RequestMapping("index")
public class IndexController extends ApiController {
    /**
     * 服务对象
     */
    @Autowired
    private CarouselService carouselService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private RedisOperator redisOperator;

    @ApiOperation(value = "获取首页轮播图列表", notes = "获取首页轮播图列表", httpMethod = "GET")
    @GetMapping("/carousel")
    public IMOOCJSONResult carousel(){
        List<Carousel> list = new ArrayList<>();
        String carousel = redisOperator.get("carousel");
        if (StringUtils.isBlank(carousel)) {
            QueryWrapper<Carousel> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("is_show", YesOrNo.YES.type);
            queryWrapper.orderByAsc("sort");
            list = carouselService.list(queryWrapper);
            redisOperator.set("carousel", JsonUtils.objectToJson(list));
        } else {
            list = JsonUtils.jsonToList(carousel,Carousel.class);
        }

        return IMOOCJSONResult.ok(list);
    }

    /**
     * 首页分类展示需求：
     * 1. 第一次刷新主页查询大分类，渲染展示到首页
     * 2. 如果鼠标上移到大分类，则加载其子分类的内容，如果已经存在子分类，则不需要加载（懒加载）
     */
    @ApiOperation(value = "获取商品分类(一级分类)", notes = "获取商品分类(一级分类)", httpMethod = "GET")
    @GetMapping("/cats")
    public IMOOCJSONResult cats() {
        QueryWrapper<Category> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("type", 1);
        List<Category> list = categoryService.list(queryWrapper);
        return IMOOCJSONResult.ok(list);
    }

    @ApiOperation(value = "获取商品子分类", notes = "获取商品子分类", httpMethod = "GET")
    @GetMapping("/subCat/{rootCatId}")
    public IMOOCJSONResult subCat(
            @ApiParam(name = "rootCatId", value = "一级分类id", required = true)
            @PathVariable Integer rootCatId) {

        if (rootCatId == null) {
            return IMOOCJSONResult.errorMsg("分类不存在");
        }

        List<CategoryVO> list = categoryService.getSubCatList(rootCatId);
        return IMOOCJSONResult.ok(list);
    }

    @ApiOperation(value = "查询每个一级分类下的最新6条商品数据", notes = "查询每个一级分类下的最新6条商品数据", httpMethod = "GET")
    @GetMapping("/sixNewItems/{rootCatId}")
    public IMOOCJSONResult sixNewItems(
            @ApiParam(name = "rootCatId", value = "一级分类id", required = true)
            @PathVariable Integer rootCatId) {

        if (rootCatId == null) {
            return IMOOCJSONResult.errorMsg("分类不存在");
        }

        List<NewItemsVO> list = categoryService.getSixNewItemsLazy(rootCatId);
        return IMOOCJSONResult.ok(list);
    }
















    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param carousel 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Carousel> page, Carousel carousel) {
        return success(this.carouselService.page(page, new QueryWrapper<>(carousel)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.carouselService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param carousel 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Carousel carousel) {
        return success(this.carouselService.save(carousel));
    }

    /**
     * 修改数据
     *
     * @param carousel 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Carousel carousel) {
        return success(this.carouselService.updateById(carousel));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.carouselService.removeByIds(idList));
    }
}