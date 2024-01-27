package com.example.business.abstracts;

import com.example.entities.concretes.User;

import java.util.List;

public interface UserService {
    void logIn(User user);
    void signUp(User user, List<User> users);
}
