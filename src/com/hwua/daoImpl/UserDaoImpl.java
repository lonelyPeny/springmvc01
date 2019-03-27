package com.hwua.daoImpl;

import com.hwua.dao.UserDao;
import com.hwua.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public User selectUserByName(String username) {
        User user1=new User(1001,"admin01","admin01");
        if (username.equals("admin1")){
            return user1;
        }
        return null;

    }

    @Override
    public Integer updateUser(User user) {
        return null;
    }

    @Override
    public List<User> seleectAllUser() {
        return null;
    }
}
