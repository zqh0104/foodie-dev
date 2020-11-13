package com.imooc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.imooc.mapper.UserAddressMapper;
import com.imooc.pojo.UserAddress;
import com.imooc.service.UserAddressService;
import org.springframework.stereotype.Service;

/**
 * 用户地址表 (UserAddress)表服务实现类
 *
 * @author 张启航
 * @since 2020-11-13 17:17:25
 */
@Service("userAddressService")
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddress> implements UserAddressService {

}