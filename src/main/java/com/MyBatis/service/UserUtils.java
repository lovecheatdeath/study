package com.MyBatis.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.InputStream;
import com.MyBatis.dao.UserDao;

public class UserUtils {
    private static SqlSessionFactory sqlSessionFactory;


    static {
        try {
//            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static UserDao UserMapper() {
        SqlSession sqlSession = null;
        UserDao userDao = null;
        try {
            sqlSession = sqlSessionFactory.openSession(true);  //通过这种方式打开的SqlSession，autoCommit为true，会自动提交事务
            userDao = sqlSession.getMapper(UserDao.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userDao;
    }
}