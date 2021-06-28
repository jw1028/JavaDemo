package org.example.controller;


import org.example.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@ResponseBody
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/test1")
    public String login1( ) {
        return "登录失败!";
    }

    @RequestMapping("/test")
    public String login(@RequestBody User user, HttpServletRequest req ) {
        if(user != null) {
            if(user.getUsername().equals("root") && user.getPassword().equals("root")) {
                HttpSession session =  req.getSession();
                session.setAttribute("user", user);
                return "登录成功！";
            }else {
                return "登录失败!";
            }
        }
        return "登录失败!";
    }
}
