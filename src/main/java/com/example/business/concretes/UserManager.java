package com.example.business.concretes;

import com.example.business.abstracts.UserCheckService;
import com.example.business.abstracts.UserService;
import com.example.business.abstracts.VerificationService;
import com.example.dataaccess.abstracts.UserDao;
import com.example.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserDao dao;
    private UserCheckService service;
    private VerificationService verificationService;

    public UserManager(UserDao dao, UserCheckService service, VerificationService verificationService) {
        this.dao = dao;
        this.service = service;
        this.verificationService = verificationService;
    }

    @Override
    public void logIn(User user) {
        if (dao.getEmail(user.getEmail()) && dao.getpassword(user.getPassword())
                && verificationService.checkMailVerificated(user.getEmail())) {
            System.out.println("Login Successful: " + user.getEmail());
        } else if (dao.getEmail(user.getEmail()) && dao.getpassword(user.getPassword())) {
            System.out.println("Please, verify your account from the email sent to your email account.");
        } else {
            System.out.println("Username or password is wrong.");

        }

    }

    @Override
    public void signUp(User user, List<User> users) {
        if (!service.checkUsedEmail(user, users)) {
            System.out.println("Email is already in use.");
        } else if (!service.checkEmail(user)) {
            System.out.println("Invalid email format. Example: tester@mymail.com");
        } else if (!service.checkFirstName(user)) {
            System.out.println("Invalid first name.");
        } else if (!service.checkLastName(user)) {
            System.out.println("Invalid last name.");
        } else if (!service.checkPassword(user)) {
            System.out.println("Invalid password format.");
        } else if (!service.eMailConfirmation(true)) {
            System.out.println("Email confirmation failed.");
        } else {
            dao.addUser(user);
            System.out.println("Registration is successful: " + user.getName() + " " + user.getSurname());
        }
    }

}

