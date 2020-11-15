package com.imooc.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.imooc.pojo.Stu;
import com.imooc.service.StuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Stu)表控制层
 *
 * @author 张启航
 * @since 2020-11-13 18:07:06
 */
@RestController
@RequestMapping("stu")
public class StuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private StuService stuService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param stu  查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Stu> page, Stu stu) {
        return success(this.stuService.page(page, new QueryWrapper<>(stu)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.stuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param stu 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Stu stu) {
        return success(this.stuService.save(stu));
    }

    /**
     * 修改数据
     *
     * @param stu 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Stu stu) {
        return success(this.stuService.updateById(stu));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.stuService.removeByIds(idList));
    }
}