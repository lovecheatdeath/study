package com.jdbc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory getSqlSessionFactory() {
        String resource = "Mybatis-config.xml";
//            InputStream inputStream =Resources.getResourceAsStream("resource");/*任意的输入流（InputStream）实例*/
        InputStream inputStream = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
    public static SqlSession getSqlSession() {
        return getSqlSessionFactory().openSession();
    }
}