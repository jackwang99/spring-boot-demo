package com.spring.boot.springbootdemo.service.impl;

import com.spring.boot.springbootdemo.domain.User;
import com.spring.boot.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public List<User> listUser(String filter) {
        return null;
    }

    @Override
    public void deleteByPrimarykey(String userId) {

    }
}
