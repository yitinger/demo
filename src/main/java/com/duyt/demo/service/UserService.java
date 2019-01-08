package com.duyt.demo.service;

import com.duyt.demo.entity.User;
import com.github.pagehelper.Page;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
