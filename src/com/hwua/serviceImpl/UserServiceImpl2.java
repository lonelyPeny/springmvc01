package com.hwua.serviceImpl;

import com.hwua.dao.UserDao;
import com.hwua.entity.User;
import com.hwua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl2 implements UserService {
    @Autowired
    UserDao userDaoImpl2;
    @Override
    public String selectUserByName(String username, String password) {
        User user=userDaoImpl2.selectUserByName("admin13");
        System.out.println(user);
        return "3";
    }
}
