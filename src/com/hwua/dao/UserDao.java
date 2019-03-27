package com.hwua.dao;

import com.hwua.entity.User;

import java.util.List;

public interface UserDao {
    public User selectUserByName(String username);
    public Integer updateUser(User user);
    public List<User> seleectAllUser();
}
