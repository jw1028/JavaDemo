package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.example.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * mvc
 */
@Slf4j
//@Controller
//@ResponseBody
@RestController

@RequestMapping("/mvc")
public class MvcController {

    @RequestMapping("/get008")
    @ResponseBody
    public User getUser8() {
        User user = new User();
        user.setUsername("zjc");
        user.setPassword("123");
        return user;
    }

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/get007")
    public String getUser7()  {
        User user = new User();
        user.setUsername("zjc");
        user.setPassword("123");
        String result = null;
        try {
            result = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }


    @GetMapping("/get123")
    @ResponseBody
    public String getIndex0() {
        log.trace("我是Get请求");
        return "dsadas";
    }

    @GetMapping("/get1")

    public String getIndex5() {
        log.trace("我是Get请求");
        return "forward:/index.html";
    }

    @RequestMapping("/get1")
    public String getIndex1() {
        log.trace("我是请求重定向");
        return "redirect:/index.html";
    }

    @RequestMapping("/get2")
    public String getIndex2() {
        log.error("我是请求转发");
        return "forward:/index.html";
    }

    @RequestMapping("/get3")
    public String getIndex3(HttpServletResponse response) {
        log.error("我是301重定向");
        response.setStatus(301);
//        response.sendRedirect(http://localhost:8080/index.html);
//        response.setHeader("Location","http://localhost:8080/index.html");
        response.setHeader("Location","/index.html");

        return null;

    }
}
