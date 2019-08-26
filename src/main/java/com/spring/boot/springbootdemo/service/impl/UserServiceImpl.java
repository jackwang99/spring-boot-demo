package com.spring.boot.springbootdemo.service.impl;

import com.spring.boot.springbootdemo.domain.User;
import com.spring.boot.springbootdemo.mapper.UserMapper;
import com.spring.boot.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public void save(User user) {
        mapper.save(user);
    }

    @Override
    public void update(User user) {
        mapper.update(user);
    }

    @Override
    public List<User> listUser(String filter) {
        List<User> result = mapper.listUser(filter);
        return result;
    }

    @Override
    public void deleteByPrimarykey(String userId) {
        mapper.deleteByPrimarykey(userId);
    }
}
