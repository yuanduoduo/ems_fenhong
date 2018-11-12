package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

import javax.annotation.Resource;


@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public void insert(User user) {
    	user.setId(UUID.randomUUID().toString());
        userDao.insert(user);
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public User queryById(User user) {
        user = userDao.queryById(user);
        return user;
    }
}
