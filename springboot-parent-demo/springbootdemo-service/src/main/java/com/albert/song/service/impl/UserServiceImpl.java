package com.albert.song.service.impl;

import com.albert.song.service.UserService;
import org.springframework.stereotype.Service;



/**
 * @author Song n
 * @create 2020-03-29 14:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String testHello() {
        return "This is test Hello Method!";
    }
}
