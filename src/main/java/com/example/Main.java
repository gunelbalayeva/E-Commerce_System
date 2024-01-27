package com.example;

import com.example.business.concretes.UserCheckManager;
import com.example.business.concretes.UserManager;
import com.example.business.concretes.VerificationManager;
import com.example.dataaccess.abstracts.UserDao;
import com.example.dataaccess.concretes.HibernateDao;
import com.example.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User user1 = new User(15, "", "", "", "");
        User user2 = new User(13, "", "", "", "");

        UserManager manager = new UserManager(new HibernateDao(users), new UserCheckManager(), new VerificationManager());
        manager.signUp(user1, users);
        manager.signUp(user2, users);

    }
}