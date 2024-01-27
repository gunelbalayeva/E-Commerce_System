package com.example.Google;

import com.example.core.abstracts.SignupService;
import com.example.entities.concretes.User;

public class GoogleSignupManager implements SignupService {
    public void signUp(String message){
        System.out.println("with Google"+ message);
    }

    @Override
    public void signupServiceı(User user) {
        System.out.println(user.getName());
    }
}
