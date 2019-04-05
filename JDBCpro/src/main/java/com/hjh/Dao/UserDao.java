package com.hjh.Dao;

import com.hjh.entity.User;

import java.util.List;

public interface UserDao {
    public Integer addUser(User user);
    public Boolean updateUser(User id);
    public Boolean deleteUser (Long id);
    public User getUser(Integer id);
    public List<User> all();

}
