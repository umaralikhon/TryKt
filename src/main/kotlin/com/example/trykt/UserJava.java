package com.example.trykt;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class UserJava {

    private String email;

    public UserJava(String email){
        this.email = email;
    }
}
