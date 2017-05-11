package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.dto.Resp;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * service impl
 * Created by gray on 2017/5/11.
 */
@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public Resp findAll() {
        List<User> userList = userDao.findAll();
        return Resp.success().setData(userList);
    }
}
