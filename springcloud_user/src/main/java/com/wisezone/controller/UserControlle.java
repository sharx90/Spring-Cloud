package com.wisezone.controller;

import com.wisezone.bean.User;
import com.wisezone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserControlle {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public User getMovie(@RequestParam("id") Integer id){

        return userService.getUserByID(id);
    }

    @RequestMapping("/buymovie")
    public Map buyMovie(@RequestParam("id") Integer id){
        Map map = userService.buyMovie(id);
        return map;
    }

}
