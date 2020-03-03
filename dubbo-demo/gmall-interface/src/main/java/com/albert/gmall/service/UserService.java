package com.albert.gmall.service;

import com.albert.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author Song n
 * @create 2020-03-03 10:28
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
