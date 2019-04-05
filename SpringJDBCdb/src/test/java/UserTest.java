import java.sql.SQLException;
import java.util.List;
import com.hejiahuan.spring.vo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hejiahuan.spring.Dao.UserDao;
import com.hejiahuan.spring.vo.User;

public class UserTest {
    Long time = System.currentTimeMillis();
    @Test
    public void add1() {
        long start = System.currentTimeMillis();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao = (UserDao) applicationContext.getBean("userDao");

        int i;
        for (i = 1; i < 1000; i++) {
            try{
            User user = new User();
//            user.setId(null);
            user.setCreateAt(time);
            user.setUpdateAt(time);
            user.setName("王文文");
            user.setNum(1943L);
                dao.addUser(user);
            }
            catch(Exception e){
                e.printStackTrace();
               System.out.println("捕获异常！");
               System.out.println(System.currentTimeMillis());
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("执行消耗时间为" + (end - start) / 1000 + "秒");
    }
    @Test
    public void add2() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao = (UserDao) applicationContext.getBean("userDao");
        User user = new User();
        user.setId(null);
        user.setCreateAt(time);
        user.setUpdateAt(time);
        user.setName("王文文");
        user.setNum(1943L);
        dao.addUser(user);
    }
    @Test//改
    public void demo2(){
        User user=new User();
        user.setCreateAt(time);
        user.setUpdateAt(time);
        user.setName("www");
        user.setId(2L);

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao=(UserDao) applicationContext.getBean("userDao");
        dao.updateUser(user);
    }

    @Test//删
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao = (UserDao) applicationContext.getBean("userDao");
            dao.deleteUser(1);
    }
    @Test//查（简单查询，返回字符串）
    public void demo4(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao=(UserDao) applicationContext.getBean("userDao");
        String name=dao.searchUserName(6);
        System.out.println(name);
    }

    @Test//查（简单查询，返回对象）
    public void demo5() {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("appliactionContext.xml");
            UserDao dao = (UserDao) applicationContext.getBean("userDao");
            User user = dao.searchUser(5);
            System.out.println(user.getName());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test//查（复杂查询，返回对象集合）
    public void demo6(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("appliactionContext.xml");
        UserDao dao= (UserDao)applicationContext.getBean("userDao");
        List<User> users=dao.findAll();
        System.out.println(users.size());
    }
}