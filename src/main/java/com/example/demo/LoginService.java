package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public boolean validate(String name, String password){
        return name.equals("parshant") && password.contains("123");
    }
}
