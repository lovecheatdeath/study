import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hjh.Dao.UserMapper;
import com.hjh.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:applicationContext.xml")
public class usertest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void addUser() {
        User user = new User();
        user.setCreatetime(System.currentTimeMillis());
        user.setUpdatetime(System.currentTimeMillis());
        user.setName("听风子");
        user.setNum(2044L);
        userMapper.addUser(user);
    }
    @Test
    public void testdelete() {
        userMapper.deleteUser(8);
    }
    @Test
    public void testselect(){
        User user = new User();
        user.setNum(2001L);
        user=userMapper.selectUser(user);
        System.out.println(user);
    }
    @Test
    public void testUpdate(){
        User user = new User();
        user.setUpdatetime(System.currentTimeMillis());
        user.setName("小明");
        user.setNum(1234L);
        user.setId(6L);
        userMapper.updateUser(user);
    }
//    @Test
//    public void testList() {
//        System.out.println(userMapper);
//        List<user> cs = userMapper.list();
//        for (User c : cs) {
//            System.out.println(c.getName());
//        }
//    }
}
