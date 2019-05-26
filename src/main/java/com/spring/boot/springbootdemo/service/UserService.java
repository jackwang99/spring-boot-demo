package com.spring.boot.springbootdemo.service;

import com.spring.boot.springbootdemo.domain.User;
import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user);
    List<User> listUser(String filter);
    void deleteByPrimarykey(String userId);
}
