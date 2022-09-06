package com.qst.controller;

import com.qst.entity.User;
import com.qst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 凯
 * @date 2022/9/5 - 19:29
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping("register")
    public String register(@RequestBody User user){
        userService.getNameByNameAndPwd(user);
        return "login";
    }
}
