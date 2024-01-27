package com.example.business.concretes;

import com.example.business.abstracts.VerificationService;
import com.example.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class VerificationManager implements VerificationService {

    private List<String> verifiedMEmils = new ArrayList<String>();
    @Override
    public void sendEmail(User user) {
        System.out.println("Email to send");
    }

    @Override
    public boolean checkMailVerificated(String email) {
        if (verifiedMEmils.contains(email)){
        return true;
        }
        return false;
    }
}
