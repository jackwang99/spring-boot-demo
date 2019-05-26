package com.spring.boot.springbootdemo.controller;

import com.spring.boot.springbootdemo.domain.User;
import com.spring.boot.springbootdemo.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/submit")
    public Object submitUser(User user) {

        Map<String,Object> result = new HashMap<String, Object>();
        if(StringUtils.isBlank(user.getId())) {
            user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            userService.save(user);
        }else{
            userService.update(user);
        }


        result.put("success", true);
        result.put("msg", "登录成功");
        result.put("token", "adminxxxx");
        return result;
    }

    @PostMapping("/userlist")
    public List<User> userList(String filter){
        return userService.listUser(filter);
    }

    @PostMapping("/delete")
    public Map<String, Object> delete(String userId){
        Map<String,Object> result = new HashMap<String, Object>();
        if(StringUtils.isNoneBlank(userId)) {
            userService.deleteByPrimarykey(userId);
            result.put("success", true);
        }else {
            result.put("success", false);
        }
        return result;
    }
}
