package com.albert.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Song n
 * @create 2020-03-03 14:43
 */
public class ManApplication {



        public static void main(String[] args) throws Exception {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
            context.start();
            System.in.read(); // 按任意键退出

        }

}
