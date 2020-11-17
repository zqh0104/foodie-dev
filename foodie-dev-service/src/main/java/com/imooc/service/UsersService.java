package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.Users;
import com.imooc.pojo.bo.UserBO;

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

    /**
     * 注册用户
     * @param userBO
     * @return
     */
    public Users createUser(UserBO userBO);

    /**
     * 检索用户名和密码是否匹配，用于登录
     */
    public Users queryUserForLogin(String username, String password);

}