package com.qht.service;

import com.qht.bean.User;
import com.qht.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Override
    public List<User> queryUserAll() {
        return userMapper.selectUser();
    }

    @Override
    public User queryUser(String user, String pwd) {
        return userMapper.loginUser(user, pwd);
    }

}