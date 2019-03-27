package com.hwua.daoImpl;

import com.hwua.dao.UserDao;
import com.hwua.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl2 implements UserDao {
    @Override
    public User selectUserByName(String username) {
        String path = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(path);
        JdbcTemplate jdbcTemplate=ac.getBean("jsbcTemplate",JdbcTemplate.class);
        String sql="select * from sy_user where user/-username = ?";
        BeanPropertyRowMapper<User> p=new BeanPropertyRowMapper<User>(User.class);
        Object[] objects={username};
        User user=jdbcTemplate.queryForObject(sql,p,objects);
        return user;
    }

    @Override
    public Integer updateUser(User user) {
        String path = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(path);
        JdbcTemplate jdbcTemplate=ac.getBean("jsbcTemplate",JdbcTemplate.class);
        String sql="update sy_user set user_username = ?,user_password = ? where user_id = ?";
        Object[] objects={user.getUser_username(),user.getUser_password(),user.getUser_id()};
        int numeber=jdbcTemplate.update(sql,objects);
        return numeber;
    }

    @Override
    public List<User> seleectAllUser() {
        String path = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(path);
        JdbcTemplate jdbcTemplate=ac.getBean("jsbcTemplate",JdbcTemplate.class);
        String sql="select *from sy_user";
        RowMapper<User> rm=new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                Integer user_id=resultSet.getInt("user_id");
                String user_username=resultSet.getString("user_username");
                String user_password=resultSet.getString("user_password");
                User user=new User(user_id,user_username,user_password);
                return user;
            }
        };
        List<User> list=jdbcTemplate.query(sql,rm);
        return list;
    }
}
