import com.hjh.service.JDBCUtils;
import com.hjh.service.UserService;
import com.hjh.entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class UserTest {
    public static Logger log = Logger.getLogger(UserTest.class);
    @Test
    public void testLog(){
        log.debug("这里有个忒别严重的错误！！！！");
    }
    @Test
    public void testAdd() {
        User user = new User();
        UserService us = new UserService();
        Long time = System.currentTimeMillis() / 1000;
//        Long start = time;
        try {
//            for (int i = 0; i < 1000000; i++) {
                //jdbcTemplate.query("select xxx from xxx where xxx FOR UPDATE");
                user.setCreateAt(time);
                user.setUpdateAt(time);
                user.setName("昨夜星辰");
                user.setNum(1723L);
                int i=us.add(user);
                System.out.println("return:"+i);
//            }
            //jdbcTemplate.update("xxx");
//            Long end = time;
//            System.out.println("消耗时间为:" + (end - start));
//        con.setAutoCommit(true);//还原
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//        list = null;
//        try {//事务回滚
//            con.rollback();
//            con.setAutoCommit(true);
//            con.close();
//        } catch (SQLException e1) {
//            e1.printStackTrace();
//        }//还原
            @Test
            public void testDelete () {
                User user = new User();
                UserService us = new UserService();
//                user.setId(11L);

                boolean i=us.delete(16L);
                System.out.println("return:"+i);
            }
            @Test
            public void testSelect () {
                User user = new User();
                UserService us = new UserService();
                user.setId(10L);
//        us.get(1802L);
                User user1 = us.get(10);
                System.out.println(user1);
            }
            @Test
            public void testUpdate () {
                User user = new User();
                UserService us = new UserService();
                Long time = System.currentTimeMillis();
                user.setUpdateAt(time);
                user.setName("电");
                user.setNum(2001L);
                user.setId(10L);
                Boolean i=us.update(user);
                System.out.println("return:"+i);
            }
}