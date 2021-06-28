package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot启动类注解
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // 注意第一个参数是当前类的类对象
        SpringApplication.run(Application.class, args);
    }

}