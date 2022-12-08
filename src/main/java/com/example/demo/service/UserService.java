package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    //    查询所有用户
    public List<User> listUser();


    //    根据用户名来查询用户，并分页展示
    public PageInfo<User> listUserByName(UserQuery userQuery);

    public String delUserById(int id);

    public String addUser(User user);
    public void upUser(User user);

}
