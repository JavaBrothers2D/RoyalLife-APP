package com.example.royallifeapplication;

public class User {

    public String fullname,email,username, pass,phone;

    public User(){

    }
    public User(String fullname,String email,  String pass,String phone, String username){
        this.fullname = fullname;
        this.email = email;
        this.pass = pass;
        this.phone = phone;
        this.username = username;
    }
}
