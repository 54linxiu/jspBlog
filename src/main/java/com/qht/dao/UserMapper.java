package com.qht.dao;

import com.qht.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

    User  loginUser(@Param("id") String user,@Param("pwd") String pwd);
}
