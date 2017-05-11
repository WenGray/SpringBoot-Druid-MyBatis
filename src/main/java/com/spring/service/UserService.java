package com.spring.service;

import com.spring.dto.Resp;

/**
 * user service
 * Created by gray on 2017/5/11.
 */
public interface UserService {

    /**
     * 查询所有用户
     * @return 用户
     */
    Resp findAll();
}
