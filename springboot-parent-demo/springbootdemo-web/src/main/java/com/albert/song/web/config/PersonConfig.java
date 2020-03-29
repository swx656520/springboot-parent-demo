package com.albert.song.web.config;

import com.albert.song.web.entity.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

/**
 * @author Song n
 * @create 2020-03-29 15:56
 */
@Configuration
public class PersonConfig {

    @Value("${person.username}")
    private String username;
    @Value("${person.salary}")
    private BigDecimal salary;
    @Value("${person.age}")
    private Integer age;
    @Value("${person.sex}")
    private String sex;

    @Bean
    public Person getPerson(){
        Person person = new Person();
        person.setUsername(username);
        person.setSalary(salary);
        person.setAge(age);
        person.setSex(sex);
        return person;
    }

}
