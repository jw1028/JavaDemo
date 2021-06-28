package org.example.controller;

import lombok.Getter;
import org.example.model.User;
import org.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller//注册一个id为类名首字母小写，的bean对象
@Getter
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private User u1;

    @Autowired
    @Qualifier("u2")
    private User ukkkk;

    //注册一个返回值User对象到容器中，id=方法名
    @Bean
    public User u1(){
        User user = new User();
        user.setUsername("唐三藏");
        user.setPassword("悟空，快来救我！");
        return user;
    }

    @Bean
    public User u2(){
        User user = new User();
        user.setUsername("孙悟空");
        user.setPassword("吃俺老孙一棒！");
        return user;
    }

}
