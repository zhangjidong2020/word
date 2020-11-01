package com.bigdata.travels.service;

import com.bigdata.travels.entity.User;

public interface UserService {



    User login(User user);

    void register(User user);
}
