package com.hejiahuan.spring.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.hejiahuan.spring.Dao.UserDao;
import com.hejiahuan.spring.vo.User;

public class UserDAOImpl extends JdbcDaoSupport implements UserDao {

    public void addUser(User user) {
        String sql = "insert into task values(?,?,?,?)";
        this.getJdbcTemplate().update(sql,user.getCreateAt(),user.getUpdateAt(),user.getName(),user.getNum());
    }

    public void deleteUser(int id) {
        String sql = "delete from task where id=?";
        this.getJdbcTemplate().update(sql, id);
    }
    public void updateUser(User user) {
        String sql = "update task set createtime=?,updatetime=?,name=? where id=?";
        this.getJdbcTemplate().update(sql,user.getCreateAt(),user.getUpdateAt(),user.getName(),user.getId());
    }
    public String searchUserName(int id) {// 简单查询，按照ID查询，返回字符串
        String sql = "select name from task where id=?";
        // 返回类型为String(String.class)
        return this.getJdbcTemplate().queryForObject(sql,String.class,id);
    }
    public List<User> findAll() {// 复杂查询返回List集合
        String sql = "select * from task";
        return this.getJdbcTemplate().query(sql,new UserRowMapper());
    }
    public User searchUser(int id) {
        String sql="select * from task where id=?";
        return this.getJdbcTemplate().queryForObject(sql, new UserRowMapper(), id);
    }
    class UserRowMapper implements RowMapper<User> {
//rs为返回结果集，以每行为单位封装着
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User student = new User();
                student.setId(rs.getLong("id"));
                student.setCreateAt(rs.getLong("createtime"));
                student.setUpdateAt(rs.getLong("updatetime"));
                student.setName(rs.getString("name"));
                student.setNum(rs.getLong("num"));
                return student;
            }
        }

}