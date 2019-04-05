package com.jdbc.dao;

import com.jdbc.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询
    User select(Long id);
    //修改数据
    Integer update(User id);
    //删除用户数据
    public void delete(Long id);
    //插入数据
    public void add(User user);
    //动态查询
    List<Map<String,Object>> selectTwo(User user);
}
