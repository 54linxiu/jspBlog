package com.qht.Controller;

import com.qht.bean.User;
import com.qht.dao.UserMapper;
import com.qht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping("toLogin")
    public String toLogin(){
        System.out.println("user/login");
        return "user/login";
    }

    @RequestMapping("login")
    public String login(@RequestParam("id") String user, String pwd){
        System.out.println(user);
        User result = userService.queryUser(user, pwd);
        if(result != null){
            System.out.println("登录成功");
        }
        return "redirect:/index.jsp";
    }

    @RequestMapping("index")
    public String toIndex(){
        //重定向
        return "redirect:/index.jsp";
    }

}
