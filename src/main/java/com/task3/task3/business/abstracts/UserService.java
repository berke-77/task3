package com.task3.task3.business.abstracts;

import com.task3.task3.entities.concretes.User;

public interface UserService {
    User getByUsername(String username);
}