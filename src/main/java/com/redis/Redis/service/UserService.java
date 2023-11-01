package com.redis.Redis.service;

import com.redis.Redis.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();
}
