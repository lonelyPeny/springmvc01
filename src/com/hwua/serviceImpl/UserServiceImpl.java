package com.hwua.serviceImpl;

import com.hwua.dao.UserDao;
import com.hwua.daoImpl.UserDaoImpl;
import com.hwua.entity.User;
import com.hwua.service.UserService;

public class UserServiceImpl implements UserService {
    UserDao userDao=new UserDaoImpl();
    @Override
    public String selectUserByName(String username, String password) {
        User user =userDao.selectUserByName(username);
        if (null==user){
            return "用户名错误";
        }else if (user.getUser_password().equals(password)){
            return "登录成功";
        }else {
            return "密码错误";
        }
    }
}
