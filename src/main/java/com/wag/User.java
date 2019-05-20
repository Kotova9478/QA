package com.wag;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String incorrectEmail;

    public User(){
        firstName = "Ivan";
        lastName = "Petrov";
        email = "my@gmail.com";
        password = "123";
        phoneNumber = "1234567890";
        incorrectEmail = "323";
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getIncorrectEmail() {
        return incorrectEmail;
    }
}
