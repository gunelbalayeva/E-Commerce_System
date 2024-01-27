package com.example.business.concretes;

import com.example.business.abstracts.UserCheckService;
import com.example.entities.concretes.User;

import java.util.List;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {

    @Override
    public boolean checkPassword(User user) {
        if (user.getPassword().isEmpty()) {
            System.out.println("add to password:");
        } else if (user.getPassword().length() ==6) {
            System.out.println("add 6 character password: ");
        }
        return true;
    }

    @Override
    public boolean checkEmail(User user) {
        String exc = "tester@email.com";

        if (user.getEmail().isEmpty()) {
            System.out.println("Email cannot be left blank.");
            return false;
        } else if (user.getEmail().equals(exc)) {
            System.out.println("Invalid email format. Example: tester@mymail.com");
            return false;
        }

        return true;
    }


    @Override
    public boolean checkFirstName(User user) {
        if (user.getSurname().isEmpty()) {
            System.out.println("add first name:");
        } else if (user.getSurname().length() < 2) {
            System.out.println("add 2 character!");
        }
        return true;
    }

    @Override
    public boolean checkLastName(User user) {
        if (user.getSurname().isEmpty()) {
            System.out.println("add surname");
            return false;
        } else if (user.getSurname().length() < 2) {
            System.out.println("add 2 character ");
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean checkUsedEmail(User user, List<User> users) {
        boolean result = true;
        for (User userr : users) {
            if (userr.getEmail() == user.getEmail()) {
                result = false;
                System.out.println("It is available! " + userr.getEmail());
            }
        }
        if (result == true) {
            return true;
        }
        return false;
    }

    @Override
    public boolean eMailConfirmation(boolean click) {

        if (click) {
            System.out.println("True ");
        }
        return false;
    }
}
