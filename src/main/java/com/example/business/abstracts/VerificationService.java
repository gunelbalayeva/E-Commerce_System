package com.example.business.abstracts;

import com.example.entities.concretes.User;

public interface VerificationService {
    void sendEmail(User user);
    boolean checkMailVerificated(String email);
}
