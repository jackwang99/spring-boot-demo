package com.spring.boot.springbootdemo.controller;

import com.spring.boot.springbootdemo.domain.User;
import com.spring.boot.springbootdemo.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/submit")
    @ResponseBody
    public Map<String, Object> submitUser(@RequestBody User user) {

        Map<String,Object> result = new HashMap<String, Object>();
        if(StringUtils.isBlank(user.getId())) {
            user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            userService.save(user);
            result.put("msg", "添加成功");
        }else{
            userService.update(user);
            result.put("msg", "修改成功");
        }

        result.put("success", true);

        return result;
    }

    @GetMapping("/userlist")
    @ResponseBody
    public List<User> userList(@RequestParam String filter){
        return userService.listUser(filter);
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public Map<String, Object> delete(@RequestParam String userId){
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
