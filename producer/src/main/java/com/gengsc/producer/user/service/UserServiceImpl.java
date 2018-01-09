package com.gengsc.producer.user.service;

import com.gengsc.user.model.User;
import com.gengsc.user.service.UserService;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2018-01-03 10:30
 */
public class UserServiceImpl implements UserService {
    @Override
    public Object getUser(String id) {
        if ("001".equals(id)) {
            System.out.println("user...");
            User user = new User();
            user.setId("001");
            user.setName("tom");
            user.setAge(25);
            return user;
        }
        return null;

    }
}
