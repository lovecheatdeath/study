package com.hejiahuan.spring.Dao;

import java.util.List;

import com.hejiahuan.spring.vo.User;

public interface UserDao {

    public void addUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);

    public String searchUserName(int id);

    public User searchUser(int id);

    public List<User> findAll();

}
