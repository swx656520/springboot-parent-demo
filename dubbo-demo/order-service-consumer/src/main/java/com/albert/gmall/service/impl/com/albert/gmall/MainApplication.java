package com.albert.gmall.service.impl.com.albert.gmall;

import com.albert.gmall.service.OrderService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Song n
 * @create 2020-03-03 15:26
 */
public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        OrderService orderService = (OrderService)context.getBean(OrderService.class);
        orderService.initOrder("1");

    }
}
