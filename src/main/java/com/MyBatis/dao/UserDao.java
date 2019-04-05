package com.MyBatis.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.MyBatis.object.User;


public interface UserDao{
    //增加
@Insert("insert into tb_stu1 (create_at,update_at,name,num) values (#{createAt},#{updateAt},#{name},#{num})")
        public void add(User user);
    //删除
@Delete("delete from tb_stu1 where id=#{id}")
public void delete(Long id);
    //查询
@Select("select id,create_at,update_at,name,num from tb_stu1 where id=#{id}")
public User get(Long id);
    //修改
@Update("update tb_stu1 set update_at=#{updateAt},name=#{name},num=#{num} where id=#{id}")
    Integer update(User id);
}
