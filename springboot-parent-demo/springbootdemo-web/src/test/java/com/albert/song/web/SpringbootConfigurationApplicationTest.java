package com.albert.song.web;

import com.albert.song.web.Utils.JwtTokenUtil;
import com.albert.song.web.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Song n
 * @create 2020-03-29 16:04
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootConfigurationApplicationTest {
    @Autowired
    Person person;

    @Test
    public void printPerson(){
        System.out.println(person.toString());
    }
    @Test
    public void testToken(){
        System.out.println(JwtTokenUtil.getToken());
    }
}
