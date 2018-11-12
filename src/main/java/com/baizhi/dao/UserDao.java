package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserDao{
    public void insert(User user);
    public User queryById(User user);
}
