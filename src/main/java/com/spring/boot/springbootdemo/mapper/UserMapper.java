package com.spring.boot.springbootdemo.mapper;

import com.spring.boot.springbootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void save(User user);
    void update(User user);
    List<User> listUser(String filter);
    void deleteByPrimarykey(String userId);
}
