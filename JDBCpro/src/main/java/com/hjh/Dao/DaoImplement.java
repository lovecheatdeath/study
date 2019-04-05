package com.hjh.Dao;

import com.hjh.entity.User;
import com.hjh.Dao.UserDao;
import com.hjh.service.JDBCUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import java.sql.*;

public class DaoImplement implements UserDao {

    public Integer addUser(User user) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Integer i;

        try {
            con = JDBCUtils.getConnection();
            //下面用replace语句完成的话可以判断记录存在则更新，不存在则插入
            String sql = "replace into task (createtime,updatetime,name,num) values (?,?,?,?)";
            //具体语句replace into tb_stu1(create_at,update_at,name) values (?,?,?)
            //这里在逻辑上讲使用repalce是最好的选择
            //这里replace必须给name建立索引，才会检索name
            ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//            ps.setLong(1, user.getId());
            ps.setLong(1, user.getCreateAt());
            ps.setLong(2, user.getUpdateAt());
            ps.setString(3, user.getName());
            ps.setLong(4, user.getNum());
            ps.executeUpdate();
            rs= ps.getGeneratedKeys();
            if(rs.next()){
                return  i=rs.getInt(1);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.free(null, ps, con);
        }
        return 0;
    }
    public Boolean updateUser(User user){
        Connection con = null;

        PreparedStatement ps =null;
        try {
            con=JDBCUtils.getConnection();
            String sql = "update task set updatetime=?,name=?,num=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setLong(1, user.getUpdateAt());
            ps.setString(2,user.getName());
            ps.setLong(3,user.getNum());
            ps.setLong(4,user.getId());
            return ps.executeUpdate()==1;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public Boolean deleteUser (Long id){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
//        int i=0;
        try{
            con = JDBCUtils.getConnection();
            String sql = "delete  from task where id=?";
            ps = con.prepareStatement(sql);
            ps.setLong(1,id);
            return ps.executeUpdate()==1;
        }catch(SQLException e){
            e.printStackTrace();
        }
//        finally{
//            JDBCUtils.free(null,ps,con);
//        }
        return false;
    }
    public User getUser(Integer id){
        User user = new User();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con=JDBCUtils.getConnection();
            String sql = "SELECT id,createtime,updatetime,name,num from task where id=?";
            ps=con.prepareStatement(sql);
            ps.setLong(1,id);
            rs=ps.executeQuery();
            System.out.println(rs);
            while(rs.next()){
                user.setCreateAt(rs.getLong(2));
                user.setUpdateAt(rs.getLong(3));
                user.setName(rs.getString(4));
                user.setNum(rs.getLong(5));
            }


        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
        }
        public List<User> all(){
        Connection con = null;
        PreparedStatement ps = null;
        User user = null;
        ResultSet rs = null;
        List<User> list=null;
        try {
            con = JDBCUtils.getConnection();
            String sql = "select id,name,num from task";
            ps=con.prepareStatement(sql);
            list = new ArrayList<User>();
            rs = ps.executeQuery();
            while(rs.next()){
                user = new User();

                user.setId(rs.getLong(1));
                user.setName(rs.getString(2));
                user.setNum(rs.getLong(3));
                list.add(user);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
}