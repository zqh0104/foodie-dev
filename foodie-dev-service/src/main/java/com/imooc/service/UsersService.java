package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.Users;

/**
 * 用户表 (Users)表服务接口
 *
 * @author 张启航
 * @since 2020-11-13 17:09:12
 */
public interface UsersService extends IService<Users> {

    /**
     * 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(String username);

}