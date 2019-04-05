package com.hjh.service;

        import java.util.List;
        import java.util.Set;

        import com.hjh.Dao.*;
        import com.hjh.entity.*;

public class UserService {
    UserDao ud = new DaoImplement();

    //返回值问题实现类里面为什么
    public Integer add(User id) {

        return this.ud.addUser(id);
    }

    public Boolean delete(Long id) {
       return this.ud.deleteUser(id);
    }

    public Boolean update(User user) {
        return this.ud.updateUser(user);
    }

    public User get(Integer id) {
        return this.ud.getUser(id);
    }

    public List<User> all() {
        return this.ud.all();
    }
}

