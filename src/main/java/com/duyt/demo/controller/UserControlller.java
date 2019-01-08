package com.duyt.demo.controller;


import com.duyt.demo.controller.vo.PageVO;
import com.duyt.demo.entity.User;
import com.duyt.demo.service.UserService;
import com.duyt.demo.utils.PageBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserControlller {
    @Resource
    private UserService userService;


    @RequestMapping("findAll")
    public PageInfo<User> findAll(@RequestBody PageVO page){
        PageHelper.startPage(page.getPageNo(),page.getPageSize());
        List<User> users = userService.findAll();
        PageInfo<User> pageinfo = new PageInfo<>(users);
//        PageBean<User> pageDate = new PageBean<>(page.getPageNo(),page.getPageSize());
//        pageDate.setItems(users);
        return pageinfo;
    }
}
