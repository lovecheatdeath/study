import com.jdbc.dao.UserMapper;
import com.jdbc.entity.User;
import com.jdbc.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class test {
    Long time = System.currentTimeMillis();
    SqlSession sqlSession = MybatisUtil.getSqlSession();
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    @Test
    public void addUser(){
        User user = new User();
        user.setCreatetime(time);
        user.setUpdatetime(time);
        user.setName("弦一郎");
        user.setNum(1908L);
        mapper.add(user);
        sqlSession.commit();
        sqlSession.close();

    }
        @Test
    public void deleteUser() {
        mapper.delete(4L);
            sqlSession.commit();
            sqlSession.close();
    }
    @Test
    public void selectUser(){
        User user = new User();
        user=mapper.select(7L);
        sqlSession.commit();
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        User user = new User();
        user.setUpdatetime(time);
        user.setName("黄飞鸿");
        user.setNum(2144L);
        user.setId(6L);
        mapper.update(user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectTwo(){
        User user = new User();
        user.setNum(2001L);
//        user.setName("小明");
        List<Map<String,Object>> selectTwo = mapper.selectTwo(user);
        for(Map<String,Object> user1 : selectTwo){
            System.out.println(user1);
        }
    }


}
