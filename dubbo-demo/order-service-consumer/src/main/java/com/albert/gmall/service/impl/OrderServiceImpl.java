package com.albert.gmall.service.impl;

import com.albert.gmall.bean.UserAddress;
import com.albert.gmall.service.OrderService;
import com.albert.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Song n
 * @create 2020-03-03 10:36
 */
@Service
public class OrderServiceImpl implements OrderService {

   @Autowired
    UserService userService;
    public void initOrder(String userId) {

        List<UserAddress> list = userService.getUserAddressList(userId);
        System.out.println("UserId: " + userId);
        for (UserAddress userAddress : list) {
            System.out.println("客户地址：" + userAddress.getAddress() + " ** isDefault: " + userAddress.getIsDefault());
        }
    }
}
