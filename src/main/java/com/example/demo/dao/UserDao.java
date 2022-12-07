package com.example.demo.dao;


import com.example.demo.pojo.User;
import com.example.demo.pojo.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper // 告诉springboot这是一个mybatis的mapper类
@Repository // 将userdao交给spring容器管理 注入使用
public interface UserDao {
    //    查询所有用户
    public List<User> listUser();

    //    根据用户名来查询用户，并分页展示
    public List<User> listUserByName(UserQuery userQuery);

    public void deleteUserById(int id);

    public void addUser(User user);
}
