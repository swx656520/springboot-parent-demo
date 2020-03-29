package com.albert.song.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Song n
 * @create 2020-03-29 14:15
 */
@SpringBootApplication(scanBasePackages = "com.albert.song")
public class SpringBootWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
