package com.imooc.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.pojo.ItemsSpec;
import com.imooc.service.ItemsSpecService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计(ItemsSpec)表控制层
 *
 * @author 张启航
 * @since 2020-11-13 18:07:05
 */
@RestController
@RequestMapping("itemsSpec")
public class ItemsSpecController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ItemsSpecService itemsSpecService;

    /**
     * 分页查询所有数据
     *
     * @param page      分页对象
     * @param itemsSpec 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<ItemsSpec> page, ItemsSpec itemsSpec) {
        return success(this.itemsSpecService.page(page, new QueryWrapper<>(itemsSpec)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.itemsSpecService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param itemsSpec 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody ItemsSpec itemsSpec) {
        return success(this.itemsSpecService.save(itemsSpec));
    }

    /**
     * 修改数据
     *
     * @param itemsSpec 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody ItemsSpec itemsSpec) {
        return success(this.itemsSpecService.updateById(itemsSpec));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.itemsSpecService.removeByIds(idList));
    }
}