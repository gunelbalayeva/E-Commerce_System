package com.example.dataaccess.abstracts;

import com.example.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser (User user);
    User get(int id);
    boolean getEmail(String email);
    boolean getpassword(String password);

    List<User>getAll();

}
