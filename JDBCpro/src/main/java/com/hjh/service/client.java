package com.hjh.service;


import java.util.Set;

import com.hjh.entity.User;
import com.hjh.service.UserService;

public class client {
    public static void main(String[] args) {
        User user = new User();
        UserService us = new UserService();

        Long time = System.currentTimeMillis();
        user.setCreateAt(time);
        user.setUpdateAt(time);
        user.setName("we are");
        us.add(user);
    }
}