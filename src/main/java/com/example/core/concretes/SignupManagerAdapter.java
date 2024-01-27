package com.example.core.concretes;

import com.example.Google.GoogleSignupManager;
import com.example.core.abstracts.SignupService;
import com.example.entities.concretes.User;

public class SignupManagerAdapter implements SignupService {
    @Override
    public void signupServiceı(User user) {
        GoogleSignupManager googleSignupManager = new GoogleSignupManager();
        googleSignupManager.signupServiceı(user);
    }
}
