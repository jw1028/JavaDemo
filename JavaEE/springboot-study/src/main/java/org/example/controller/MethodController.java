package org.example.controller;

import org.example.Model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/met")

public class MethodController {
    @ResponseBody
    @GetMapping("/prople/{pid}/animal/{aid}")
    public String m1(@PathVariable String pid,
                     @PathVariable("aid") String animalId) {
        return "用户ID" + pid + "动物ID" + animalId;

    }

    @RequestMapping("/getName")
    public String m2(String name ) {
        return "姓名:" + name;

    }

    @RequestMapping("/login")
    //方法的参数必须传值
    public String m3(@RequestBody(required = true) String name, String password) {
        return "姓名:" + name + "密码" + password;

    }

    @RequestMapping("/register")
    //方法的参数必须传值
    public String m4(@RequestParam String name) {
        return "姓名:" + name ;
    }


    @RequestMapping("/register2")
    public String m5(String username, String password, String img) {
        return "姓名:" + username + "密码" + password + "img"  + img;

    }

    @RequestMapping("/register3")
    public String m6(@RequestBody User user) {
        return "username: " + user.getUsername() +
                "password: " + user.getPassword() +
                "img: " +user.getImg();
    }
}
