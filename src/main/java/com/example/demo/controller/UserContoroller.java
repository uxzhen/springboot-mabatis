package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserContoroller {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    //@ResponseBody
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

    // /delUserById?id=1
    @GetMapping("/delUserById")
    @ResponseBody
    public String delUserByIdV1(String id){
         userService.delUserById(Integer.parseInt(id));
        //System.out.println(listUser);
        return "删除成功";
    }

    // /delUserById/1
    @GetMapping("/delUserById/{id}")
    //@ResponseBody
    public String delUserById(@PathVariable("id") String id){
         userService.delUserById(Integer.parseInt(id));
        //System.out.println(listUser);
        return "删除成功";
    }


}
