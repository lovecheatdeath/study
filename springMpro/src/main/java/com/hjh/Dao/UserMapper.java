package com.hjh.Dao;

import java.util.List;

import com.hjh.entity.User;

public interface UserMapper {
    //查询全部用户信息
    List<User> queryAll();
    //查询
    public User selectUser(User num);
    //模糊查询，查询通过用户名查询用户信息
//    List<User> getUserListByUserName(String name);
    //修改数据
    Integer updateUser(User id);
    //删除用户数据
    Integer deleteUser(Integer id);
    //插入数据
    Integer addUser(User name);
}