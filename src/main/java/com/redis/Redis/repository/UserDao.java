package com.redis.Redis.repository;

import com.redis.Redis.model.User;

import java.util.List;

public interface UserDao {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
