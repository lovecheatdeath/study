import com.MyBatis.dao.UserDao;
import com.MyBatis.object.User;
import com.MyBatis.service.UserUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class test {
    UserDao userDao=UserUtils.UserMapper();
    Long time = System.currentTimeMillis();

    @Test
    public void add(){
        User user= new User();
        user.setCreateAt(time);
        user.setUpdateAt(time);
        user.setName("苇名");
        user.setNum(1919L);
        userDao.add(user);
        }
        @Test
        public void delete(){
            User user= new User();
        userDao.delete(3L);
    }
    @Test
    public void select(){
        User user= new User();
        user=userDao.get(3L);
        System.out.println(user);
    }
    @Test
    public void update(){
        User user= new User();
        user.setUpdateAt(time);
        user.setName("狼");
        user.setNum(1504L);
        user.setId(5L);
        userDao.update(user);
    }
}
