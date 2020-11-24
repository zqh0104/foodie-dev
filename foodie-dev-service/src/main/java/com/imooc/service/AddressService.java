package com.imooc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.imooc.pojo.UserAddress;

/**
 * 用户地址表 (UserAddress)表服务接口
 *
 * @author 张启航
 * @since 2020-11-13 17:09:12
 */
public interface AddressService extends IService<UserAddress> {

    /**
     * 修改默认地址
     * @param userId
     * @param addressId
     */
    public void updateUserAddressToBeDefault(String userId, String addressId);

    /**
     * 根据用户id和地址id，查询具体的用户地址对象信息
     * @param userId
     * @param addressId
     * @return
     */
    public UserAddress queryUserAddres(String userId, String addressId);

}