package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 交给Service容器管理
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }

    @Override
    public PageInfo<User> listUserByName(UserQuery userQuery) {
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());
        return new PageInfo<User>(userDao.listUserByName(userQuery));
    }
}
