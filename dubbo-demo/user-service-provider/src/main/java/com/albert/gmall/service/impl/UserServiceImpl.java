package com.albert.gmall.service.impl;

import com.albert.gmall.bean.UserAddress;
import com.albert.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author Song n
 * @create 2020-03-03 10:36
 */
@Service
public class UserServiceImpl implements UserService {
    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress userAddress1 = new UserAddress(1,"shenzhen","01","albert","13900000","Y");
        UserAddress userAddress2 = new UserAddress(1,"foshan","01","albert","13900000","N");

        return Arrays.asList(userAddress1,userAddress2);
    }
}

