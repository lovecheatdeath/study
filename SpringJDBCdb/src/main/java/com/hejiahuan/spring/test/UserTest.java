package com.hejiahuan.spring.test;

import com.hejiahuan.spring.Dao.UserDao;
import com.hejiahuan.spring.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    public static void main(String[] args) {
        User user = new User();
        user.setId(51L);
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setName("王文文");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao = (UserDao) applicationContext.getBean("userDao");
        dao.addUser(user);

    }
}
  /*  @Test//改
    public void demo2(){
        User user=new User();
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setName("www");
        user.setId(2L);

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao=(UserDao) applicationContext.getBean("userDao");
        dao.updateUser(user);
    }

    @Test//删
    public void demo3(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao=(UserDao) applicationContext.getBean("userDao");
        dao.deleteUser(3);
    }

    @Test//查（简单查询，返回字符串）
    public void demo4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao=(UserDao) applicationContext.getBean("userDao");
        String name=dao.searchUserName(4);
        System.out.println(name);
    }

    @Test//查（简单查询，返回对象）
    public void demo5(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao=(UserDao) applicationContext.getBean("userDao");
        User user=dao.searchUser(1);
        System.out.println(user.getName());
    }

    @Test//查（复杂查询，返回对象集合）
    public void demo6(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao=(UserDao) applicationContext.getBean("userDao");
        List<User> users=dao.findAll();
        System.out.println(users.size());
    }
}*/