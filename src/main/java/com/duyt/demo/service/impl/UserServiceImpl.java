package com.duyt.demo.service.impl;

import com.duyt.demo.dao.UserMapper;
import com.duyt.demo.entity.User;
import com.duyt.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
