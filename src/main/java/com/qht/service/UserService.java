package com.qht.service;

import com.qht.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> queryUserAll();
    User queryUser(@Param("id") String user,@Param("pwd") String pwd);
}
