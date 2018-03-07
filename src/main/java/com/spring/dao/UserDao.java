package com.spring.dao;

import com.spring.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User表相关语句
 *
 * @author Gray
 * @date 2017/5/7
 */
@Mapper
@Component
public interface UserDao {

    /**
     * 查询所有User
     * @return 所有user
     */
    List<User> findAll();
}
