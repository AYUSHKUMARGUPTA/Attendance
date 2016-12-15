package com.example.anita.attendance;

/**
 * Created by Anita on 12/11/2016.
 */
public class User {
    String Department,Username,Password,ReenterPassword;

    public User (String Department, String Username, String Password, String ReenterPassword ){
        this.Department = Department;
        this.Username = Username;
        this.Password = Password;
        this.ReenterPassword = ReenterPassword;
    }

    public User(String Username,String Password){
        this.Username = Username;
        this.Password = Password;
        this.Department = "";
    }
}
