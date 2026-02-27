package com.task3.task3.business.concretes;

import com.task3.task3.business.abstracts.UserService;
import com.task3.task3.dataAccess.abstracts.UserDao;
import com.task3.task3.entities.concretes.User;
import org.springframework.stereotype.Service;

@Service
public class UserManager implements UserService {

    private final UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getByUsername(String username) {
        User user = userDao.findByUsername(username);
        if (user == null) {
            throw new RuntimeException("User not found: " + username);
        }
        return user;
    }
}