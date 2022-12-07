package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserContoroller {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    @ResponseBody
    public String index(Model model, UserQuery userQuery){
       PageInfo<User> userPageInfo =  userService.listUserByName(userQuery);
        model.addAttribute("page",userPageInfo);
        return "index";
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        List<User> listUser =  userService.listUser();
        //System.out.println(listUser);
        return listUser;
    }



}
