package com.asianpaint.customer;
public class User {
 
    //Declare varaiables for User class
    private int userId;
    private String username;
    private String password;
    private String mail;
    private int tp;
    private String role;

     //Create parametrized constructor for User class
    public User(int userId, String username, String password, String mail, int tp, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.mail = mail;
        this.tp = tp;
        this.role = role;
    }

    //Generate getters for the User class varaiables
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public int getTp() {
        return tp;
    }

    public String getRole() {
        return role;
    }

}
