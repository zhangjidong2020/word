package com.bigdata.travels.test;

import com.bigdata.travels.TravelsApplication;
import com.bigdata.travels.entity.User;
import com.bigdata.travels.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = TravelsApplication.class)
@RunWith(SpringRunner.class)
public class TestUserService {

    @Autowired
    private UserService userService;

    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("xiaochen");
        user.setPassword("123");
        user.setEmail("xiaochen@qq.com");
        userService.register(user);
    }
}
