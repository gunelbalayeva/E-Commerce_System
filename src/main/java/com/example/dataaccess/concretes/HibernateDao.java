package com.example.dataaccess.concretes;

import com.example.dataaccess.abstracts.UserDao;
import com.example.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateDao implements UserDao {

    List<User> users = new ArrayList<User>();

    public HibernateDao(List<User> users) {
        this.users = users;
    }

    @Override
    public void addUser(User user) {
        System.out.println("with Hibernate added.." + user.getName() + " " + user.getSurname());
        users.add(user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("with Hibernate updated.." + user.getName() + " " + user.getSurname());
        users.add(user);
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("with Hibernate deleted.." + user.getName() + " " + user.getSurname());
        users.add(user);
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public boolean getEmail(String email) {
        for (User user : users) {
            if (user.getEmail() == email) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean getpassword(String password) {
        for (User user : users) {
            if (user.getPassword() == password) ;
            return true;
        }
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
